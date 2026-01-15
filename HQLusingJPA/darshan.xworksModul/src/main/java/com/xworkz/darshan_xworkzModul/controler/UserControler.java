package com.xworkz.darshan_xworkzModul.controler;

import com.xworkz.darshan_xworkzModul.dto.SignUpDto;
import com.xworkz.darshan_xworkzModul.service.UserService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
@RequestMapping("/")
public class UserControler {
    @Autowired
    UserService userService;

    public UserControler() {
        System.out.println("User Controler is Created");
    }


    @GetMapping("signUp")
    public String signUp() {
        return "Register.jsp";
    }

    @GetMapping("signIn")
    public String signIn() {
        return "Login.jsp";
    }

    @SneakyThrows
    @PostMapping("/registerDetails")
    public String registerUser(SignUpDto signUpDto,Model model) {

        System.out.println(signUpDto);
        boolean isSaved = userService.ValidateAndSave(signUpDto);
        if (isSaved) {
            model.addAttribute("user",signUpDto);
            return "Result.jsp";
        } else return "Error.jsp";

    }

    @PostMapping("loginGamil")
    public String getGmailAndPassword(@RequestParam("email") String gmail, @RequestParam("password") String password, Model model) {

        System.out.println(gmail);
        System.out.println(password);

        Boolean isCorrect = userService.getGmailAndPassword(gmail, password);

        if (isCorrect) {
            return "Home.jsp";

        } else {
            model.addAttribute("Error", "Invalid Email And Password");


            return "Login.jsp";
        }

    }
}
