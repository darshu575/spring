package com.workz.zomoto.controler;

import com.workz.zomoto.dto.RestourentDto;
import com.workz.zomoto.services.RestourentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

            return "Response.jsp";
        } else return "Error.jsp";

    }
@GetMapping("/search")
    public String searchFoodName(@RequestParam("food") String foodname ,Model model){
    System.out.println(foodname);

    return "Search.jsp";
}


}
