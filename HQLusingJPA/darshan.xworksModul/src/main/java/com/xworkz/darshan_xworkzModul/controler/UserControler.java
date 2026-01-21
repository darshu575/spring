package com.xworkz.darshan_xworkzModul.controler;

import com.xworkz.darshan_xworkzModul.dao.UserDao;
import com.xworkz.darshan_xworkzModul.dto.SignUpDto;
import com.xworkz.darshan_xworkzModul.entity.OtpEntity;
import com.xworkz.darshan_xworkzModul.service.EmailService;
import com.xworkz.darshan_xworkzModul.service.UserService;
import com.xworkz.darshan_xworkzModul.util.OtpUtil;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.validation.Valid;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/")
public class UserControler {
    @Autowired
    UserService userService;
    @Autowired
    UserDao userDao;
    @Autowired
    EmailService emailService;

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
    public ModelAndView registerUser(@Valid SignUpDto signUpDto, BindingResult bindingResult, ModelAndView mv) {

//        boolean isSaved = userService.ValidateAndSave(signUpDto);
//
//        System.out.println(isSaved);
//        if (isSaved) {
//
//            return "Result.jsp";
//        } else return "Error.jsp";
        System.out.println("BackEnd Validation Started");
        System.out.println(bindingResult.toString());
        if (bindingResult.hasErrors()) {
            if (bindingResult.hasFieldErrors("userName")) {
                mv.addObject("NameError", bindingResult.getFieldError("userName").getDefaultMessage());
            }


            if (bindingResult.hasFieldErrors("email")) {
                mv.addObject("EmailError", bindingResult.getFieldError("email").getDefaultMessage());

            }

            if (bindingResult.hasFieldErrors("phoneNumber")) {
                mv.addObject("PhoneNumberError", bindingResult.getFieldError("phoneNumber").getDefaultMessage());

            }
            if (bindingResult.hasFieldErrors("age")) {
                mv.addObject("AgeError", bindingResult.getFieldError("age").getDefaultMessage());

            }


            if (bindingResult.hasFieldErrors("gender")) {
                mv.addObject("GenderError", bindingResult.getFieldError("gender").getDefaultMessage());

            }

            if (bindingResult.hasFieldErrors("address")) {
                mv.addObject("AddressError",
                        bindingResult.getFieldError("address").getDefaultMessage());
            }


            if (bindingResult.hasFieldErrors("password")) {
                mv.addObject("PasswordError", bindingResult.getFieldError("password").getDefaultMessage());
            }


            if (bindingResult.hasFieldErrors("confirmPassword")) {
                mv.addObject("ConfirmPasswordError", bindingResult.getFieldError("confirmPassword").getDefaultMessage());
            }

            if (!signUpDto.getPassword().equals(signUpDto.getConfirmPassword())) {
                mv.addObject("ConfirmPasswordError", "Password Not Match");

            }
            mv.setViewName("Register.jsp");
            return mv;
        } else {
//        if (bindingResult.hasErrors()) {
//            bindingResult.getFieldErrors().forEach(error ->
//                    mv.addObject(error.getField() + "Error",
//                            error.getDefaultMessage())
//            );
            System.out.println("Backend Validation Ended");
            if (signUpDto != null) {
                boolean isSaved = userService.ValidateAndSave(signUpDto);

                System.out.println(isSaved);
                if (isSaved) {
                    mv.setViewName("Result.jsp");
                    return mv;
                } else
                    mv.setViewName("Error.jsp");
                return mv;
            } else System.out.println("Data Is Not Valid");
        }
        return mv;
    }


    @PostMapping("loginGamil")
    public String getGmailAndPassword(@RequestParam("email") String gmail, @RequestParam("password") String
            password, Model model) {

        System.out.println(gmail);
        System.out.println(password);

        Boolean isCorrect = userService.getGmailAndPassword(gmail, password);
        if (isCorrect) {
            userService.updateCount(gmail);
            return "Home.jsp";

        } else {
            model.addAttribute("Error", "Invalid Email And Password");
            model.addAttribute("email", gmail);
            int isGet = userService.getCount(gmail);
            if (isGet >= 2) {
                model.addAttribute("disable", true);
                model.addAttribute("enableLink", true);
                return "Login.jsp";
            } else {
                userService.getCountGmail(gmail);
            }


            return "Login.jsp";
        }

    }
@PostMapping("/sendOtp")
public ModelAndView otpPage(@RequestParam String email){
    System.out.println("sendOtp started");
        String otp= OtpUtil.generateOtp();
    System.out.println(otp);

   OtpEntity otpEntity=new OtpEntity();
    otpEntity.setEmail(email);
    otpEntity.setOtp(otp);
    otpEntity.setCreatedTime(LocalDateTime.now());

    emailService.sendOtp(email,otp);

    userDao.saveOtp(otpEntity);


    ModelAndView modelAndView=new ModelAndView();
    modelAndView.addObject("email",email);
    modelAndView.setViewName("Otp.jsp");
    System.out.println("sendOtp started");
    return modelAndView;

}
@PostMapping("/verifyOtp")
public  ModelAndView verifyOtp(@RequestParam String email,@RequestParam String otp){
    System.out.println("VerifyOtp started");
          OtpEntity dbOtp=userDao.findOtpByGmail(email,otp);


          if (dbOtp!=null && dbOtp.getOtp().equals(otp)){
            userDao.deleteOpt(dbOtp);

              ModelAndView mv=new ModelAndView();
              mv.setViewName("Home.jsp");
              return  mv;
          }

          ModelAndView modelAndView=new ModelAndView();
          modelAndView.addObject("error","Invalid Otp");
          modelAndView.addObject("email",email);
          modelAndView.setViewName("Otp.jsp");
    System.out.println("VerifyOtp ended");
          return modelAndView;

}



}
