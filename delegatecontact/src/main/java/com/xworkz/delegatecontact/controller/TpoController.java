package com.xworkz.delegatecontact.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.delegatecontact.dto.DelegateDto;
import com.xworkz.delegatecontact.dto.EventDTO;
import com.xworkz.delegatecontact.dto.RespondDto;
import com.xworkz.delegatecontact.servies.delegateservice.DelegateService;
import com.xworkz.delegatecontact.servies.tposervice.TpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;
import java.util.List;

@Controller
@RequestMapping("/tpo")
public class TpoController {

    public TpoController() {
        System.out.println("TpoController Started");
    }

    @Autowired
    TpoService tpoService;

    @Autowired
    DelegateService delegateService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "TpoLoginPortal";
    }

    @GetMapping("/openRegisterStudent")
    public String DelegateREgister() {
        return "DelegateRegister";
    }

    @PostMapping("/tpologin")
    public String tpoLoginPortal(@RequestParam String email, @RequestParam String loginCode, HttpSession session, Model model) {

        System.out.println("tpoLoginPortal controller started");
        System.out.println(email);
        System.out.println(loginCode);

        boolean login = tpoService.tpoLoginPortal(email, loginCode);
        if (login) {
            session.setAttribute("tpoemail", email);
            int totalEvents = tpoService.countEvents(email);
            int emailsSent = delegateService.countEmailsSent(email);
            int totalResponses = delegateService.countResponses(email);

            model.addAttribute("totalEvents", totalEvents);
            model.addAttribute("emailsSent", emailsSent);
            model.addAttribute("totalResponses", totalResponses);

            return "TpoDashboard";
        } else {
            return "TpoLoginPortal";
        }

    }

    @GetMapping("/reviewEvents")
    public ModelAndView getEventsByTpoEmail(HttpSession session, ModelAndView modelAndView) {
        String email = session.getAttribute("tpoemail").toString();

        List<EventDTO> event = tpoService.getAssignedEvents(email);
        modelAndView.addObject("events", event);
        modelAndView.setViewName("ReceivedEvent");
        return modelAndView;

    }

    @PostMapping("/registerDelegate")
    public ModelAndView RegisterDelegate(@ModelAttribute DelegateDto dto, ModelAndView modelAndView,HttpSession session) {
        System.out.println("ResisterDelegate method Started");
        String tpoemail= session.getAttribute("tpoemail").toString();
        dto.setTpoEmail(tpoemail);

        boolean saved = delegateService.saveDelegate(dto);
        if (saved) {
            modelAndView.addObject("saved", "Register Successfully");
            modelAndView.setViewName("DelegateRegister");
        } else {
            modelAndView.addObject("error", "Not Saved");
            modelAndView.setViewName("DelegateRegister");
        }

        return modelAndView;
    }

    @PostMapping("/contactDelegate")
    public String sendEmailToDelagate(@RequestParam int eventId, RedirectAttributes redirectAttributes, HttpSession session) {
        String tpoEmail = session.getAttribute("tpoemail").toString();
        System.out.println(tpoEmail);
        delegateService.sendEmailToDelegate(eventId, tpoEmail);
        redirectAttributes.addFlashAttribute("successMsg", "Email Send to Delegate Successfully");



        return "redirect:/tpo/reviewEvents";
    }

    @GetMapping("/viewResponses")
    public ModelAndView viewRespond(HttpSession session, ModelAndView modelAndView) {
        String tpoEmail = session.getAttribute("tpoemail").toString();
        System.out.println(tpoEmail);

        List<RespondDto> respondDtos = delegateService.getResponsesByTpo(tpoEmail);
        modelAndView.addObject("responses", respondDtos);
        modelAndView.setViewName("ViewRespond");

        return modelAndView;
    }


}
