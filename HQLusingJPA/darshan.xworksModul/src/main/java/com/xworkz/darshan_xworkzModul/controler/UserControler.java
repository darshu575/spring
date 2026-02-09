package com.xworkz.darshan_xworkzModul.controler;

import com.xworkz.darshan_xworkzModul.dao.UserDao;
import com.xworkz.darshan_xworkzModul.dto.SignUpDto;
import com.xworkz.darshan_xworkzModul.dto.memberDto.MemberDto;
import com.xworkz.darshan_xworkzModul.dto.teamDto.TeamDto;
import com.xworkz.darshan_xworkzModul.entity.OtpEntity;
import com.xworkz.darshan_xworkzModul.service.EmailService;
import com.xworkz.darshan_xworkzModul.service.TeamServices.TeamService;
import com.xworkz.darshan_xworkzModul.service.UserService;
import com.xworkz.darshan_xworkzModul.service.memberServices.MemberServices;
import com.xworkz.darshan_xworkzModul.util.OtpUtil;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.*;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserControler {
    @Autowired
    UserService userService;
    @Autowired
    UserDao userDao;
    @Autowired
    EmailService emailService;
    @Autowired
    TeamService teamService;
    @Autowired
    MemberServices memberServices;

    public UserControler() {
        System.out.println("User Controler is Created");
    }


    @GetMapping("signUp")
    public String signUp()   {
        return "Register.jsp";
    }

    @GetMapping("signIn")
    public String signIn() {
        return "Login.jsp";
    }

    @GetMapping("dashboard")
    public String dashboard() {
        return "DashBoard.jsp";
    }


    @GetMapping("addTeam")
    public String addTeams() {
        return "AddTeams.jsp";
    }

    @GetMapping("/addMember")
    public ModelAndView addMember(@RequestParam int teamId) {
        ModelAndView mav = new ModelAndView("addMember.jsp");
        mav.addObject("teamId", teamId);
        return mav;
    }


    @SneakyThrows
    @PostMapping("/registerDetails")
    public ModelAndView registerUser(@ModelAttribute @Valid SignUpDto signUpDto, BindingResult bindingResult,
                                     @RequestParam("userProfileImage") MultipartFile file, ModelAndView mv) {

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
                mv.addObject("AddressError", bindingResult.getFieldError("address").getDefaultMessage());
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
        }
        try {
            if (file != null || file.isEmpty()) {
                String uploadDir = "D:/signUp-images/";
                String filePath = System.currentTimeMillis() + "_" + file.getOriginalFilename();
                File dest = new File(uploadDir + filePath);
                file.transferTo(dest);

                signUpDto.setUserProfilePath("D:/signUp-images/" + filePath);
            }
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
                } else mv.setViewName("Error.jsp");
                return mv;
            } else System.out.println("Data Is Not Valid");


        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }


    @PostMapping("loginGamil")
    public String getGmailAndPassword(@RequestParam("email") String gmail, @RequestParam("password") String
            password, Model model, HttpSession session) {

        System.out.println(gmail);
        System.out.println(password);

        SignUpDto signUpDto = userService.getPasswordByGmail(gmail, password);
        System.out.println(signUpDto);

        session.setAttribute("user", signUpDto);

        if (signUpDto != null) {
            userService.updateCount(gmail);
            return "Home.jsp";
        } else {
            model.addAttribute("Error", "Invalid Email And Password");
            session.setAttribute("email", gmail);
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
    public ModelAndView otpPage(@RequestParam String email) {
        System.out.println("sendOtp started");
        String otp = OtpUtil.generateOtp();
        System.out.println(otp);

        OtpEntity otpEntity = new OtpEntity();
        otpEntity.setEmail(email);
        otpEntity.setOtp(otp);
        otpEntity.setCreatedTime(LocalDateTime.now());

        emailService.sendOtp(email, otp);

        userDao.saveOtp(otpEntity);


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("email", email);
        modelAndView.setViewName("Otp.jsp");
        System.out.println("sendOtp ended");
        return modelAndView;

    }

    @PostMapping("/verifyOtp")
    public ModelAndView verifyOtp(@RequestParam String email, @RequestParam String otp) {
        System.out.println("VerifyOtp started");
        OtpEntity dbOtp = userDao.findOtpByGmail(email, otp);


        if (dbOtp != null && dbOtp.getOtp().equals(otp)) {
            userDao.deleteOpt(dbOtp);

            ModelAndView mv = new ModelAndView();
            mv.addObject("reSetEmail", email);
            mv.setViewName("ReSetPassord.jsp");
            return mv;
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error", "Invalid Otp");
        modelAndView.addObject("email", email);
        modelAndView.setViewName("Otp.jsp");
        System.out.println("VerifyOtp ended");
        return modelAndView;

    }

    @PostMapping("/reSetPassword")
    private ModelAndView passwordReSet(@RequestParam("newEmail") String email, @RequestParam("newPassword") String
            newPassword, @RequestParam("confirmPassword") String ConfirmPassword, ModelAndView modelAndView) throws
            Exception {
        System.out.println(email);
        System.out.println(newPassword);
        System.out.println(ConfirmPassword);

        boolean isUpadate = userService.updatePassword(email, newPassword, ConfirmPassword);
        if (isUpadate) {
            userService.updateCount(email);
            modelAndView.setViewName("Login.jsp");
            return modelAndView;
        } else {
            modelAndView.addObject("ErrorPassord", "Password Not Match");
        }


        return null;
    }

    @PostMapping("/saveTeam")
    public ModelAndView addTeams(@ModelAttribute TeamDto teamDto, @RequestParam("teamProfileImage") MultipartFile
                                         file,
                                 ModelAndView modelAndView) {

        System.out.println(teamDto);

        try {
            if (file != null || file.isEmpty()) {
                String uploadDir = "D:/team-images/";
                String filePath = System.currentTimeMillis() + "_" + file.getOriginalFilename();
                File dest = new File(uploadDir + filePath);
                file.transferTo(dest);

                teamDto.setTeamProfileImagePath("D:/team-images/" + filePath);
            }

            boolean isSaved = teamService.addTeamsAndSave(teamDto);
            if (isSaved) {
                modelAndView.addObject("successMessage", "Team Added Successufully");
            } else {
                modelAndView.addObject("NotSaved", "Team Not Added");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        modelAndView.setViewName("AddTeams.jsp");
        return modelAndView;
    }

    @GetMapping("/getViewTeam")
    public ModelAndView getAllTeams(ModelAndView modelAndView) {

        System.out.println("GetViewTeam Controller ");
        List<TeamDto> teams = teamService.getAllteams();
        modelAndView.addObject("dto", teams);
        modelAndView.setViewName("ViewTeams.jsp");
        return modelAndView;

    }

    @PostMapping("/saveMember")
    public ModelAndView addMember(@ModelAttribute MemberDto memberDto,
                                  @RequestParam("profileImage") MultipartFile file,
                                  ModelAndView modelAndView) {
        System.out.println("addMember controller");
        System.out.println(memberDto);

        try {

            if (file != null && !file.isEmpty()) {
                String uploadDir = "D:/member-images/";
                String filePath = System.currentTimeMillis() + "_" + file.getOriginalFilename();
                File dest = new File(uploadDir + filePath);
                file.transferTo(dest);
                // Set file path in DTO
                memberDto.setProfileImagePath("D:/member-images/" + filePath);
            }

            // Save member details including file path
            boolean isSaved = memberServices.savememberDetails(memberDto);

            if (isSaved) {
                modelAndView.addObject("successMessage", "Member Added Successfully");
            } else {
                modelAndView.addObject("error", "Member Not Added");
            }

        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.addObject("error", "Member Not Added: " + e.getMessage());
        }

        modelAndView.setViewName("addMember.jsp");
        return modelAndView;
    }

    @GetMapping("/getViewMember")
    public ModelAndView getAllMember(@RequestParam int teamId, ModelAndView modelAndView) {
        System.out.println("getAll Member Controller");
        System.out.println(teamId);
        List<MemberDto> members = memberServices.getAllMemberById(teamId);
        System.out.println(members);
        modelAndView.addObject("memberDto", members);
        modelAndView.setViewName("ViewMember.jsp");
        return modelAndView;
    }

    @GetMapping("download")
    public void getImage(HttpServletResponse response, @RequestParam String profileImage) throws IOException {
        System.out.println(profileImage);
        System.out.println("Get Image Controller");
        File file = new File(profileImage);
        InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
        ServletOutputStream servletOutputStream = response.getOutputStream();
        IOUtils.copy(inputStream, servletOutputStream);
        response.flushBuffer();
    }

    @GetMapping("/getUserDetails")
    public ModelAndView editProfileDetails(@RequestParam("userEmail") String email, ModelAndView modelAndView) {

        System.out.println("editProfileDetails controller started ");
        SignUpDto user = userService.getUserDetailsByEmail(email);


        System.out.println("editProfileDetails controller getting data:" + user);
        modelAndView.addObject("editeUser", user);
        modelAndView.setViewName("UpdateProfile.jsp");
        return modelAndView;

    }
    @PostMapping("/updateProfileInfo")
  public ModelAndView updateUserDetails(@ModelAttribute  SignUpDto signUpDto,@RequestParam("userProfileImage") MultipartFile file, ModelAndView modelAndView) throws IOException {
        System.out.println("updateUserDetails started");

        if (file != null || file.isEmpty()) {
            String uploadDir = "D:/signUp-images/";
            String filePath = System.currentTimeMillis() + "_" + file.getOriginalFilename();
            File dest = new File(uploadDir + filePath);
            file.transferTo(dest);

            signUpDto.setUserProfilePath("D:/signUp-images/" + filePath);
        }
        System.out.println(signUpDto);
        boolean userDetailsUpdated=userService.updateUserDetails(signUpDto);
        if (userDetailsUpdated){
            modelAndView.addObject("updated","Updated successfully");
        }else {
            modelAndView.addObject("NotUpdated","Not Updated");
        }
modelAndView.setViewName("UpdateProfile.jsp");
return modelAndView;
    }

}
