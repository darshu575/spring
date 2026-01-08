package com.workz.zomoto.controler;

import com.workz.zomoto.dto.RestourentDto;
import com.workz.zomoto.services.RestourentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Component
@RequestMapping("/")
public class RestoController {

    @Autowired
    RestourentServices restourentServices;


    public RestoController() {
        System.out.println("RestoController Object Created");
    }

    @PostMapping("/addRestorent")
    public String addRestourent(RestourentDto restourentDto) {
        System.out.println(restourentDto);

        boolean isRestoAdded = restourentServices.validationAndSave(restourentDto);
        if (!isRestoAdded) {

            return "Response";
        } else return "Error";

    }

    @GetMapping("/search")
    public String searchFoodName(@RequestParam("restourent") String restoName, Model model) {
        System.out.println(restoName);

        Optional<RestourentDto> restourentDto = restourentServices.validateAndSerach(restoName);
        model.addAttribute("restoName", restourentDto.get());

        return "SearchByName";
    }

    @GetMapping("/searchByNumber")
    public String searchByGmail(@RequestParam("gmail") String gmail, Model model) {
        System.out.println(gmail);

        Optional<RestourentDto> restourentDto = restourentServices.ValidateEmailAndSerch(gmail);
        model.addAttribute("gmail", restourentDto.get());


        return "SearchByGmail";
    }

    @GetMapping("getRestourent/{restorentName}")
    public String getRestourent(@PathVariable("restorentName") String name, Model model) {

        System.out.println(name);
        Optional<RestourentDto> restourentDto = restourentServices.getRestourentByName(name);
        if (restourentDto.isPresent()) {
            model.addAttribute("rname", restourentDto.get());
            return "/UpdateRestourent";

        }


        return "/UpdateRestourent";

    }

    @PostMapping("/updateRestourent")
    public String updateRestourent(RestourentDto restourentDto) {

        boolean isUpadte = restourentServices.validateAndUpdate(restourentDto);
        if (!isUpadte) {
            return "Response";
        } else {
            return "Error.jsp";
        }
    }


}
