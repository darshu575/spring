package com.xworkz.rashmi_xworkzmodule.controller;

import com.xworkz.rashmi_xworkzmodule.dto.UserDTO;
import com.xworkz.rashmi_xworkzmodule.exceptions.DataInvalidException;
import com.xworkz.rashmi_xworkzmodule.exceptions.UserAlreadyExistsException;
import com.xworkz.rashmi_xworkzmodule.exceptions.UserNotFounException;
import com.xworkz.rashmi_xworkzmodule.service.XworkzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class XworkzModuleController {

    @Autowired
    private XworkzService xworkzService;

    @RequestMapping("/index")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("/signUp")
    public String getSignUpPage(){
        return "RegistrationPage";
    }

    @RequestMapping("/signInPage")
    public String getSignInPage(){
        return "SignIn";
    }

    @RequestMapping("/signInWithOTP")
    public String getSignInWithOTP(){
        return "SignInWithOTP";
    }

    @PostMapping("/registerUser")
    public ModelAndView registerUser(@Valid UserDTO userDTO, BindingResult bindingResult , ModelAndView model){
        try {
//            if (bindingResult.hasErrors()){
//                if (bindingResult.hasFieldErrors("userName")){
//                    model.addObject("nameError",bindingResult.getFieldError("userName"));
//                }
//                if (bindingResult.hasFieldErrors("userEmail")){
//                    model.addObject("emailError",bindingResult.getFieldError("userEmail"));
//                }
//                if (bindingResult.hasFieldErrors("phoneNumber")){
//                    model.addObject("phoneNumberError",bindingResult.getFieldError("phoneNumber"));
//                }
//                if (bindingResult.hasFieldErrors("age")){
//                    model.addObject("ageError",bindingResult.getFieldError("age"));
//                }
//                if (bindingResult.hasFieldErrors("gender")){
//                    model.addObject("genderError",bindingResult.getFieldError("gender"));
//                }
//                if (bindingResult.hasFieldErrors("address")){
//                    model.addObject("addressError",bindingResult.getFieldError("address"));
//                }
//                if (bindingResult.hasFieldErrors("password")){
//                    model.addObject("passwordError",bindingResult.getFieldError("password"));
//                }
//                if (bindingResult.hasFieldErrors("confirmPassword")){
//                    model.addObject("confirmPasswordError",bindingResult)
//                }
//            }

            if (bindingResult.hasErrors()){
                bindingResult.getFieldErrors().forEach(error->
                        model.addObject(error.getField()+"Error",error.getDefaultMessage()));
                model.setViewName("RegistrationPage");

            }else {
                if (!xworkzService.checkUserExistsByEmail(userDTO.getUserEmail()) || !xworkzService.checkUserExistsByPhone(userDTO.getPhoneNumber())) {
                    boolean isSaved = xworkzService.validateAndSave(userDTO);
                    if (isSaved)
                        model.setViewName("SignIn");

                }
            }
        } catch (DataInvalidException | UserAlreadyExistsException e) {
            model.addObject("confirmPasswordError","Password does not match");
            model.setViewName("RegistrationPage");
            model.addObject("errorMsg",e.getMessage());
            }
            return model;
        }


        @PostMapping("/signIn")
    public String signIn(@RequestParam("userEmail")String email,@RequestParam("password")String password,Model model){
        boolean isUserExists = false;

        try {
             isUserExists =  xworkzService.checkUser(email, password);
            if (isUserExists) {
                xworkzService.setCountToZero(email);
                return "Home";
            }
        } catch (UserNotFounException e) {
          int count =  xworkzService.getCount(email);
            model.addAttribute("userEmail", email);
            System.out.println(count);
            if (count>=2){
                model.addAttribute("disableLogin", true);
                model.addAttribute("showForgot", true);
                return "SignIn";
            }else{
                xworkzService.updateCount(email);
                model.addAttribute("errorMsg",e.getMessage());
            }

        }
        return "SignIn";
    }

}
