package com.xworkz.delegatecontact.controller;

import com.xworkz.delegatecontact.servies.emailsentservice.EmailSentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class EmailSentController {

    public EmailSentController(){
        System.out.println("EmailSendController Started");
    }
    @Autowired
    EmailSentService emailSentService;


    @PostMapping("/sendEventEmail")
    public ModelAndView sendEventEmail(@RequestParam int eventId,ModelAndView modelAndView){
        System.out.println("SendEventEmail Started");
        emailSentService.sendEventEmailToTPO(eventId);
        modelAndView.addObject("message", "Emails sent successfully to all TPOs!");
        modelAndView.setViewName("redirect:/events");



        return  modelAndView;
    }




}
