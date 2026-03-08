package com.xworkz.delegatecontact.controller;

import com.xworkz.delegatecontact.servies.tposervice.TpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tpo")
public class TpoController {

    public TpoController() {
        System.out.println("TpoController Started");
    }
    @Autowired
    TpoService tpoService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "TpoLoginPortal";
    }

    @PostMapping("/tpologin")
    public ModelAndView tpoLoginPortal(@RequestParam String email, @RequestParam String loginCode, ModelAndView modelAndView) {
        System.out.println("tpoLoginPortal controller started");
        System.out.println(email);
        System.out.println(loginCode);

        boolean login=tpoService.tpoLoginPortal(email,loginCode);
        if (login){
            modelAndView.addObject("success","TpoLoginPortal Login SuccessFully");
            modelAndView.setViewName("TpoDashboard");
        }else {
            modelAndView.addObject("error","Login Field");
            modelAndView.setViewName("TpoLoginPortal");
        }
        return modelAndView;
    }


}
