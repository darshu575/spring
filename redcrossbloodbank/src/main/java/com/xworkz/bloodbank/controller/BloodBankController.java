package com.xworkz.bloodbank.controller;

import com.xworkz.bloodbank.dto.BloodBankDto;
import com.xworkz.bloodbank.services.BloodBankServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class BloodBankController {
    @Autowired
    private BloodBankServices services;

    public BloodBankController() {
        System.out.println("BloodBankController contractor invoked");


    }

    @PostMapping("/createAccount")
    public String creatDonorAccount(BloodBankDto bloodBankDto) {

        boolean isSaved = services.validateAndSaveDonorAccount(bloodBankDto);
        if (!isSaved) {
            return "Response.jsp";
        }
        return "Error.jsp";
    }

@GetMapping("/searchbyGmail")
    public String searchByGmail(@RequestParam("donorGmail") String gmail, Model model){
    System.out.println(gmail);

    Optional<BloodBankDto> bloodBankDto=services.validateAndSearchGmail(gmail);
    return "Search.jsp";

    }


}
