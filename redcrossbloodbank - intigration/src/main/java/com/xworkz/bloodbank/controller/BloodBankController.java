package com.xworkz.bloodbank.controller;

import com.xworkz.bloodbank.dto.BloodBankDto;
import com.xworkz.bloodbank.services.BloodBankServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class BloodBankController {
    @Autowired
    private BloodBankServices services;

    public BloodBankController() {
        System.out.println("BloodBankController contractor invoked");


    }

    //@PostMapping("/createAccount")
    public String creatDonorAccount(BloodBankDto bloodBankDto) {

        boolean isSaved = services.validateAndSaveDonorAccount(bloodBankDto);
        if (!isSaved) {
            return "Response.jsp";
        }
        return "Error.jsp";
    }

    @GetMapping("/searchbyGmail")
    public String searchByGmail(@RequestParam("donorGmail") String gmail, Model model) {
        System.out.println(gmail);

        BloodBankDto dto = services.validateAndSearchGmail(gmail);

        if (dto != null) {
            model.addAttribute("dto", dto);

        } else {
            model.addAttribute("error", "Not found");
        }
        return "Search.jsp";

    }
@GetMapping("getDonors/{donorsId}")
    public String searchBtId(@PathVariable("donorsId") String id, Model model){

        BloodBankDto bloodBankDto=services.validateAndSearchById(id);
        if (bloodBankDto!=null){


            model.addAttribute("donors",bloodBankDto);
        }

return "Update.jsp";
    }





    @PostMapping("/createAccount")
    public String createRedCrossBloodAccount(BloodBankDto dto) {
        System.out.println(dto);
        boolean isSaved = services.validateAndSaveDonors(dto);
        System.out.println(isSaved);

        if (!isSaved) {
            return "Response.jsp";
        }
        return "Error.jsp";

    }


}
