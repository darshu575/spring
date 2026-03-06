package com.xworkz.delegatecontact.controller;

import com.xworkz.delegatecontact.dto.EventDTO;
import com.xworkz.delegatecontact.servies.eventService.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class HomeController {
    private HomeController(){
        System.out.println("Home Controller Started");
    }

    @Autowired
    private EventService eventService;

    @GetMapping("/")
    public String index(Model model) {

        List<EventDTO> eventList = eventService.getAllEvents();


        model.addAttribute("eventList", eventList);

        return "index";
    }
}