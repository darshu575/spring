package com.xworks.exapmlesProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UsersControler {

    public UsersControler(){
        System.out.println("User Controller is Created");
    }

    @GetMapping("SignIn")
    public String signIn() {
        return "Login.jsp";
    }





}
