package com.xworkz.xworkzModel.controller;

import com.xworkz.xworkzModel.dto.EmailOTPDto;
import com.xworkz.xworkzModel.dto.UserDto;
import com.xworkz.xworkzModel.entity.EmailOTPEntity;
import com.xworkz.xworkzModel.service.ModelService;
import com.xworkz.xworkzModel.utility.EmailOTPSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestMapping("/")
@Controller
public class ModelController {

    @Autowired
    ModelService service;

    public ModelController() {
        System.out.println("controller object..");
    }

    @GetMapping("signUp")
    public String signUp() {
        return "SignUp";
    }

    @GetMapping("signIn")
    public String signIn() {
        return "SignIn";
    }

    @PostMapping("signUpUser")
    public ModelAndView signUpUser(@Valid UserDto dto, BindingResult bindingResult, ModelAndView model) {
        System.out.println(dto);

       UserDto exist = service.findByEmail(dto.getEmail());
        System.out.println("existss :"+exist);
        if (exist != null){

            model.addObject("exist","email id already exists..!");
            model.setViewName("SignUp");
            return model;
        }else{

        if (bindingResult.hasErrors()) {

            if (bindingResult.hasFieldErrors("fName")) {
                System.out.println("------>" + bindingResult.getFieldError("fName").getDefaultMessage());
                model.addObject("fNameError", bindingResult.getFieldError("fName").getDefaultMessage());
                model.setViewName("SignUp");

            }

            if (bindingResult.hasFieldErrors("lName")) {

                model.addObject("lNameError", bindingResult.getFieldError("lName").getDefaultMessage());
                model.setViewName("SignUp");
            }

            if (bindingResult.hasFieldErrors("age")) {
                System.out.println(bindingResult.getFieldError("age").getDefaultMessage());
                model.addObject("ageError", bindingResult.getFieldError("age").getDefaultMessage());
                model.setViewName("SignUp");
            }

            if (bindingResult.hasFieldErrors("gender")) {
                model.addObject("genderError", bindingResult.getFieldError("gender").getDefaultMessage());
                model.setViewName("SignUp");
            }

            if (bindingResult.hasFieldErrors("email")) {
                model.addObject("emailError", bindingResult.getFieldError("email").getDefaultMessage());
                model.setViewName("SignUp");
            }

            if (bindingResult.hasFieldErrors("mobile")) {
                model.addObject("mobileError", bindingResult.getFieldError("mobile").getDefaultMessage());
                model.setViewName("SignUp");
            }

            if (bindingResult.hasFieldErrors("password")) {
                model.addObject("passwordError", bindingResult.getFieldError("password").getDefaultMessage());
                model.setViewName("SignUp");
            }

            if (!dto.getPassword().equals(dto.getConfirmPassword())) {
                model.addObject("confirmPasswordError", "password and confirm password must be match");
                model.setViewName("SignUp");
            }

            model.setViewName("SignUp");
            return model;
        } else {
            //save
            System.out.println("calling service--");
            boolean saved = service.validAndSave(dto);

            System.out.println("Saved from service :" + saved);
            if (saved) {
                model.addObject("success", "Successfully Sign Up..!");
            } else {
                model.addObject("error", "Try again Later ..!");
            }
            model.setViewName("SignUp");

            return model;

        }

    }}

    @PostMapping("signInUser")
    public ModelAndView signInUser(HttpSession session,String email, String password, ModelAndView model) {
        System.out.println("controller started");
        UserDto dto = service.findByEmail(email);

        if (email == null || email.trim().isEmpty() ||dto==null) {
            model.addObject("error", "Please enter valid email");
            model.setViewName("SignIn");
            return model;
        }

        int attempts = dto.getFailedAttempts();
        System.out.println("Attempts:" + attempts);

        int updatedAttempts = attempts + 1;
        System.out.println("updated attempts" + updatedAttempts);

        dto.setFailedAttempts(updatedAttempts);
        System.out.println("after set updated attempts" + dto);

        boolean updatedDto = service.setAttemptsZero(dto.getId(), updatedAttempts);
        System.out.println("updated dto after set attempts:" + updatedDto);

        UserDto afterSetAttempts = service.findByEmail(email);

        if (afterSetAttempts.getFailedAttempts() >= 3) {
            model.addObject("error", "already reached invalid  pwd limit");
            model.addObject("showForgot", true);
//            model.addAttribute("showLogin", false);
//            boolean updatedAttemptsToZero = service.setAttemptsZero(afterSetAttempts.getId(), 0);
//            System.out.println("attempts updated to zero " + updatedAttemptsToZero);
            model.addObject("error", "All attempts are over..! please click on Forgot password");
            model.setViewName("SignIn");
            return model;
        }
        if (service.signIn(email, password)) {

            session.setAttribute("user",afterSetAttempts);
            model.addObject("success", "Valid enter successful ");
            boolean updatedAttemptsToZero = service.setAttemptsZero(dto.getId(), 0);
            model.setViewName("Home");
            return model;
        }

        model.addObject("error", "Enter valid Credential");
        model.setViewName("SignIn");
        return model;

    }

    @GetMapping("logOut")
    public String logOut() {
        return "index";
    }

    @Autowired
    EmailOTPSender otpSender;

    @GetMapping("forgotPassword")
    public String forgotPassword() {

//        otpSender.sendOtp("manojbetadur005@gmail.com");
        return "ForgotPasswordForm";
    }

    @PostMapping("sendOtp")
    public ModelAndView sendOtp(String email, ModelAndView modelAndView) {

        System.out.println("otp sending");

        String otp = otpSender.sendOtp(email);
        System.out.println("send otp" + otp);

        LocalDateTime createdTime = LocalDateTime.now();
        System.out.println("Local time is :"+createdTime);

        EmailOTPDto emailOTPDto = new EmailOTPDto(email,otp,createdTime);

       boolean saved = service.svaeOtpWithEmail(emailOTPDto);

     if (saved) {
         modelAndView.addObject("email",email);
         modelAndView.addObject("otpSent", "OTP sent to your registered email");
         modelAndView.setViewName("ForgotPasswordForm");
     }else{
         modelAndView.addObject("error", "Enter correct registered email or Try again after sometimes..");
         modelAndView.setViewName("ForgotPasswordForm");
     }
        return modelAndView;
    }

    @PostMapping("verifyOtp")
    public ModelAndView verifyOtp(String email, String otp, ModelAndView modelAndView, HttpSession session){

        System.out.println("email:"+email);

        session.setAttribute("email",email);
        System.out.println("otp:"+otp);
        LocalDateTime createdTime = LocalDateTime.now();
//        System.out.println("email:"+email);
       boolean saved = service.getOtpBymail(email,otp);

        System.out.println("entity by email :"+saved);

        modelAndView.addObject("dto",saved);

        modelAndView.addObject("showForgotPassword",saved);

        modelAndView.setViewName("ForgotPasswordForm");
        return modelAndView;
    }

    @PostMapping("resetPassword")
    public ModelAndView resetPassword(HttpSession session,String email,String newPassword,String confirmPassword,ModelAndView modelAndView){

        System.out.println("Email :"+email);
        System.out.println("Password :"+newPassword);
        System.out.println("Confirm Password :"+confirmPassword);
// check both are equal or no
        if (!newPassword.equals(confirmPassword)){
            System.out.println("mis match password");
            modelAndView.addObject("missMatch","password and confirm password should be matched..!");
            modelAndView.setViewName("ForgotPasswordForm");
            return modelAndView;

        }
        //save reset pwd -- true
      boolean resetSuccess =  service.resetPassword(email,newPassword,confirmPassword);

        if (resetSuccess){

            System.out.println("reset success :"+resetSuccess);
            modelAndView.addObject("resetSuccess","Password reset successfully..!");
            modelAndView.setViewName("ForgotPasswordForm");
            return modelAndView;
        } else{
//
            //false
            System.out.println("reset fail :"+resetSuccess);

            modelAndView.addObject("resetFail","User does not exist..!(sign up first)");
            modelAndView.setViewName("ForgotPasswordForm");
            return modelAndView;
        }
//        return modelAndView;
    }

}
