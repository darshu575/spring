package com.xworkz.delegatecontact.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.delegatecontact.dto.RespondDto;
import com.xworkz.delegatecontact.servies.delegateservice.DelegateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/delegate")
public class DelegateController {
    public DelegateController() {
        System.out.println("DelegateController Started");
    }

    @Autowired
    DelegateService delegateService;

    @GetMapping("/respond")
    public String openRespondPage(@RequestParam int eventId, Model model) {
        return "DelegateRespondPage";
    }

    @PostMapping("/saveResponse")
    public ModelAndView saveRespond(@ModelAttribute RespondDto respondDto, ModelAndView modelAndView) {
        boolean save = delegateService.saveRespond(respondDto);
        modelAndView.addObject("saved", save);
        modelAndView.setViewName("DelegateRespondPage");
        return modelAndView;
    }

}
