package com.xworkz.xworkzModel.controller;

import com.xworkz.xworkzModel.dto.batchdto.BatchDTO;
import com.xworkz.xworkzModel.dto.studentDto.StudentDTO;
import com.xworkz.xworkzModel.service.batchService.BatchService;
import com.xworkz.xworkzModel.service.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class StudentsController {
    public StudentsController() {
        System.out.println("student controller object created");
    }

    @Autowired
    StudentService studentService;

    @Autowired
    BatchService batchService;

    @GetMapping("addStudentButton")
    public ModelAndView addStudentButton(ModelAndView modelAndView, Integer batchId) {
        System.out.println("getting student form..");
        System.out.println(batchId + "batch id");

        modelAndView.addObject("batch", batchId);
        modelAndView.addObject("add", "Start adding here");
        modelAndView.setViewName("NewStudentAddForm");
        return modelAndView;
    }

    @PostMapping("saveNewStudent")
    public ModelAndView saveNewStudent(StudentDTO studentDTO, Integer batchId, ModelAndView modelAndView, BindingResult bindingResult) {

        System.out.println("Adding new students");

        System.out.println("batch id :" + batchId);
        System.out.println("student dto :" + studentDTO);

        if (bindingResult.hasErrors()) {

            if (bindingResult.hasFieldErrors("name")) {

                modelAndView.addObject("nameError", bindingResult.getFieldError("name").getDefaultMessage());
                modelAndView.setViewName("NewStudentAddForm");
                return modelAndView;
            }

            if (bindingResult.hasFieldErrors("email")) {

                modelAndView.addObject("emailError", bindingResult.getFieldError("email").getDefaultMessage());
                modelAndView.setViewName("NewStudentAddForm");
                return modelAndView;
            }

            if (bindingResult.hasFieldErrors("mobile")) {

                modelAndView.addObject("mobileError", bindingResult.getFieldError("mobile").getDefaultMessage());
                modelAndView.setViewName("NewStudentAddForm");
                return modelAndView;
            }

            if (bindingResult.hasFieldErrors("gender")) {

                modelAndView.addObject("genderError", bindingResult.getFieldError("gender").getDefaultMessage());
                modelAndView.setViewName("NewStudentAddForm");
                return modelAndView;
            }

            if (bindingResult.hasFieldErrors("dob")) {

                modelAndView.addObject("dobError", bindingResult.getFieldError("dob").getDefaultMessage());
                modelAndView.setViewName("NewStudentAddForm");
                return modelAndView;
            }

            if (bindingResult.hasFieldErrors("courseMode")) {

                modelAndView.addObject("courseModeError", bindingResult.getFieldError("courseMode").getDefaultMessage());
                modelAndView.setViewName("NewStudentAddForm");
                return modelAndView;
            }
            if (bindingResult.hasFieldErrors("joiningDate")) {

                modelAndView.addObject("joiningDateError", bindingResult.getFieldError("joiningDate").getDefaultMessage());
                modelAndView.setViewName("NewStudentAddForm");
                return modelAndView;
            }
        } else {
            //saving student
            boolean saved = studentService.saveStudent(studentDTO, batchId);

            if (saved) {
                modelAndView.addObject("batchId", batchId);
                modelAndView.addObject("success", "Student added successfully..");
            } else {
                modelAndView.addObject("error", "Can't able to add student, try again after sometimes..!");
            }
        }
        modelAndView.setViewName("AddNewStudent");
        return modelAndView;
    }

    @GetMapping("getAllStudentsInBatch")
    public ModelAndView viewBatchStudents(ModelAndView modelAndView, Integer batchId) {

        System.out.println("getting all students ..");
        System.out.println("batch id :" + batchId);

        BatchDTO batch = batchService.fetchById(batchId);
        List<StudentDTO> studentList = studentService.getAllStudentsByBatchId(batchId);

        System.out.println("all students in controller :" + studentList);

        modelAndView.addObject("batchId", batchId);
        modelAndView.addObject("batch", batch);
        modelAndView.addObject("student", studentList);
        modelAndView.setViewName("AllStudentList");
        return modelAndView;
    }

    @GetMapping("backToStudentList")
    public ModelAndView backToStudentList(ModelAndView modelAndView) {

        modelAndView.setViewName("AllStudentList");
        return modelAndView;
    }
}
