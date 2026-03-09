package com.xworkz.delegatecontact.controller;

import com.xworkz.delegatecontact.dto.EventDTO;
import com.xworkz.delegatecontact.servies.tposervice.TpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

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
    public String tpoLoginPortal(@RequestParam String email, @RequestParam String loginCode, HttpSession session) {
        System.out.println("tpoLoginPortal controller started");
        System.out.println(email);
        System.out.println(loginCode);

        boolean login=tpoService.tpoLoginPortal(email,loginCode);
        if (login){
            session.setAttribute("tpoemail",email);
           return "TpoDashboard";
        }else {
return "TpoLoginPortal";
        }

    }
@GetMapping("/reviewEvents")
    public ModelAndView getEventsByTpoEmail(HttpSession session, ModelAndView modelAndView){
        String email= session.getAttribute("tpoemail").toString();

    List<EventDTO> event =tpoService.getAssignedEvents(email);
    modelAndView.addObject("events", event);
    modelAndView.setViewName("ReceivedEvent");
    return  modelAndView;

}

}
