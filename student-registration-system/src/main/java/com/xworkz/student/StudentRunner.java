package com.xworkz.student;

import com.xworkz.student.config.StudentConfiguration;
import com.xworkz.student.dto.StudentDto;
import com.xworkz.student.services.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        StudentDto studentDto=new StudentDto("darshan",24,9019828925L,"darshan@gmail.com","mca");
        StudentDto studentDto1=new StudentDto("vinayak",23,9483752304L,"darshan@gmail.com","Mba");


        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(StudentConfiguration.class);

        StudentService service=applicationContext.getBean(StudentService.class);
        service.validateAndSave(studentDto1);


        System.out.println("main Ended");
    }
}
