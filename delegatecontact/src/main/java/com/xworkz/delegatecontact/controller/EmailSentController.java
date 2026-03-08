package com.xworkz.delegatecontact.controller;

import com.xworkz.delegatecontact.servies.emailsentservice.EmailSentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailSentController {

    public EmailSentController(){
        System.out.println("EmailSendController Started");
    }
    @Autowired
    EmailSentService emailSentService;


    @PostMapping("/admin/sendEventEmail")
    public ModelAndView sendEventEmail(@RequestParam int eventId,ModelAndView modelAndView){

        emailSentService.sendEventEmailToTPO(eventId);
        modelAndView.addObject("message", "Emails sent successfully to all TPOs!");
        modelAndView.setViewName("redirect:/manageEvents");



        return  modelAndView;
    }




}
