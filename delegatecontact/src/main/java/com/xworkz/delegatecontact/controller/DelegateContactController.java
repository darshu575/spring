package com.xworkz.delegatecontact.controller;

import com.xworkz.delegatecontact.dto.EventDTO;
import com.xworkz.delegatecontact.dto.RespondDto;
import com.xworkz.delegatecontact.servies.AdminService;
import com.xworkz.delegatecontact.servies.eventService.EventService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.time.LocalDate;
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
            return "redirect:/adminDashboard";
        } else {
            model.addAttribute("error", "Invalid Email or Password");
            return "adminLogin";
        }
    }

    @GetMapping("/adminDashboard")
    public String dashboard(HttpSession session, Model model) {

        Object admin = session.getAttribute("admin");

        if (admin == null) {
            return "redirect:/loginForm";
        }
        int totalEvents= adminService.getTotalEvents();


        int totalDelegates = adminService.getTotalDelegates();
        int totalResponses = adminService.getTotalResponses();
        List<Object[]> eventResponses = adminService.getEventResponseCount();

        model.addAttribute("totalEvents",totalEvents);
        model.addAttribute("totalDelegates",totalDelegates);
        model.addAttribute("totalResponses",totalResponses);
        model.addAttribute("eventResponses",eventResponses);



        List<EventDTO> list = eventService.getAllEvents();
        System.out.println("Dashboard Events: " + list);
        model.addAttribute("eventLists", list);
        model.addAttribute("today", LocalDate.now());   // ADD THIS LINE
        return "adminDashboard";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "index";
    }

    @GetMapping("/admin/dashboard")
    public String GoToDashBoard() {
        return "adminDashboard";
    }

    @SneakyThrows
    @PostMapping("/createEvent")
    public String saveEvent(@ModelAttribute EventDTO dto, @RequestParam("brochure") MultipartFile file, RedirectAttributes redirectAttributes) {
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
                redirectAttributes.addFlashAttribute("success", "Event Created Successfully");

            } else {
                redirectAttributes.addFlashAttribute("error", "Event Not Created");

            }


        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Something went wrong!");
        }
        return "redirect:/";
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

    @GetMapping("/allResponses")
    public ModelAndView getAllTpoResponses(ModelAndView modelAndView) {
        System.out.println("GetAllTpoResponses");
        List<RespondDto> respondDtos = eventService.getAllTpoResponses();
        modelAndView.addObject("responses", respondDtos);
        modelAndView.setViewName("AdminDelegateResponse");

        return modelAndView;
    }


}
