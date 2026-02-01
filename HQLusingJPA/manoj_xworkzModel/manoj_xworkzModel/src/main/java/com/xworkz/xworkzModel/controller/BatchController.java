package com.xworkz.xworkzModel.controller;

import com.xworkz.xworkzModel.dto.batchdto.BatchDTO;
import com.xworkz.xworkzModel.service.batchService.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RequestMapping("/")
@Controller
public class BatchController {

    public BatchController() {
        System.out.println("Batch controller object");
    }

    @Autowired
    BatchService batchService;

    @GetMapping("addNewBatch")
    public ModelAndView addNewBatch(ModelAndView modelAndView) {

        modelAndView.setViewName("NewBatchForm");
        return modelAndView;
    }

    @PostMapping("newBatchForm")
    public ModelAndView newBatchForm(@Valid BatchDTO dto, BindingResult bindingResult, ModelAndView modelAndView) {

        System.out.println("adding new batch");

        if (bindingResult.hasErrors()) {

            if (bindingResult.hasFieldErrors("batchName")) {

                modelAndView.addObject("batchNameError", bindingResult.getFieldError("batchName").getDefaultMessage());
                modelAndView.setViewName("NewBatchForm");
            }
            if (bindingResult.hasFieldErrors("batchCode")) {

                modelAndView.addObject("batchCodeError", bindingResult.getFieldError("batchCode").getDefaultMessage());
                modelAndView.setViewName("NewBatchForm");
            }
            if (bindingResult.hasFieldErrors("trainerName")) {

                modelAndView.addObject("trainerNameError", bindingResult.getFieldError("trainerName").getDefaultMessage());
                modelAndView.setViewName("NewBatchForm");
            }
            if (bindingResult.hasFieldErrors("course")) {

                modelAndView.addObject("courseError", bindingResult.getFieldError("course").getDefaultMessage());
                modelAndView.setViewName("NewBatchForm");
            }

            if (bindingResult.hasFieldErrors("startDate")) {
                modelAndView.addObject(
                        "startDateError",
                        bindingResult.getFieldError("startDate").getDefaultMessage()
                );
                System.out.println(bindingResult.getGlobalError().getDefaultMessage());
                modelAndView.setViewName("NewBatchForm");
                return modelAndView;
            }

            if (bindingResult.hasFieldErrors("endDate")) {
                modelAndView.addObject(
                        "endDateError",
                        bindingResult.getFieldError("endDate").getDefaultMessage()
                );
                System.out.println(bindingResult.getGlobalError().getDefaultMessage());
                modelAndView.setViewName("NewBatchForm");
                return modelAndView;
            }

            if (bindingResult.hasGlobalErrors()) {
                modelAndView.addObject(
                        "dateError",
                        bindingResult.getGlobalError().getDefaultMessage()
                );

                System.out.println(bindingResult.getGlobalError().getDefaultMessage());
                modelAndView.setViewName("NewBatchForm");
                return modelAndView;
            }
            modelAndView.setViewName("NewBatchForm");
            return modelAndView;
        }
        System.out.println(dto);
        boolean saved = batchService.addNewBatch(dto);
        if (saved) {
            modelAndView.addObject("success", "New Batch added successfully..!");
            modelAndView.setViewName("NewBatchForm");
            return modelAndView;
        } else {
            modelAndView.addObject("error", "Try again after sometimes..!");
            modelAndView.setViewName("NewBatchForm");
            return modelAndView;
        }

    }

    @GetMapping("viewAllBatches")
    public ModelAndView getAllBatch(ModelAndView modelAndView){

        System.out.println("getting all batches");

      List<BatchDTO> dto = batchService.getAllBatch();

      modelAndView.addObject("dto",dto);
      modelAndView.setViewName("AllBatches");
        return modelAndView;
    }


    @GetMapping("viewBatchStudents")
    public ModelAndView viewBatch(Integer batchId,ModelAndView modelAndView) {
        System.out.println("getting all students ...");
        System.out.println("batch id :"+batchId);

       BatchDTO batch = batchService.fetchById(batchId);
        System.out.println("dto by id :"+batch);


        modelAndView.addObject("batch",batch);
        modelAndView.setViewName("AllStudentList");
        return modelAndView;
    }

}
