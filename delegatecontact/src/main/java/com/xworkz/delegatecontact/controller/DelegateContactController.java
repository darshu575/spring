package com.xworkz.delegatecontact.controller;

import com.xworkz.delegatecontact.servies.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class DelegateContactController {

    public DelegateContactController(){
        System.out.println("DelegateContactController Started");
    }
    @Autowired
    AdminService adminService;

    @GetMapping("/loginForm")
    public String loginPage() {
        return "adminLogin.jsp";
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
            return "adminDashboard.jsp";
        } else {
            model.addAttribute("error", "Invalid Email or Password");
            return "adminLogin.jsp";
        }
    }}
