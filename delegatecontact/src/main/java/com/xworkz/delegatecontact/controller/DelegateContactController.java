package com.xworkz.delegatecontact.controller;

import com.xworkz.delegatecontact.dto.EventDTO;
import com.xworkz.delegatecontact.entity.eventEntity.EventEntity;
import com.xworkz.delegatecontact.servies.AdminService;
import com.xworkz.delegatecontact.servies.eventService.EventService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("/")
public class DelegateContactController {

    public DelegateContactController() {
        System.out.println("DelegateContactController Started");
    }

    @Autowired
    AdminService adminService;

    @Autowired
    EventService eventService;

    @GetMapping("/loginForm")
    public String loginPage() {
        return "adminLogin";
    }


    @PostMapping("/adminLogin")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        HttpSession session,
                        Model model) {
        System.out.println("Admin Controller started");

        System.out.println(email);
        System.out.println(password);

        boolean valid = adminService.validateAdmin(email, password);

        if (valid) {
            session.setAttribute("admin", email);
            return "adminDashboard";
        } else {
            model.addAttribute("error", "Invalid Email or Password");
            return "adminLogin";
        }
    }

    @GetMapping("/adminDashboard")
    public String dashboard(HttpSession session, Model model) {

        if (session.getAttribute("admin") == null) {
            return "redirect:/loginForm";
        }

        // Dummy data for now (later connect from service)
        model.addAttribute("totalEvents", 12);
        model.addAttribute("totalDelegates", 350);
        model.addAttribute("totalResponses", 280);

        return "adminDashboard";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/loginForm";
    }

    @SneakyThrows
    @PostMapping("/createEvent")
    public ModelAndView saveEvent(@ModelAttribute EventDTO dto, @RequestParam("brochure") MultipartFile file, ModelAndView modelAndView) {
        System.out.println("Save Event Controller is Started");
        System.out.println(dto);
        try {

            if (file != null && !file.isEmpty()) {
                String uploadDir = "D:/DelagateProject/";
                String filePath = System.currentTimeMillis() + "_" + file.getOriginalFilename();
                File dest = new File(uploadDir + filePath);
                System.out.println(dest);
                file.transferTo(dest);
                // Set file path in DTO
                dto.setBrochurePath("D:/DelagateProject/" + filePath);
            }


            boolean saved = eventService.saveEvent(dto);
            if (saved) {
                modelAndView.addObject("Saved", "Event Created Successfully");
                modelAndView.setViewName("index");

            } else {
                modelAndView.addObject("error", "Event Not Created");
                modelAndView.setViewName("index");
            }

            return modelAndView;
        } finally {
            System.out.println("");
        }


    }

    @GetMapping("/events")
    public ModelAndView getAllEvent(ModelAndView modelAndView) {
        System.out.println("GetAllEvent Controller started");
        List<EventDTO> eventList = eventService.getAllEvents();
        System.out.println(eventList);
        modelAndView.addObject("eventList", eventList);
        modelAndView.setViewName("ManageEvents");
        return modelAndView;
    }
}
