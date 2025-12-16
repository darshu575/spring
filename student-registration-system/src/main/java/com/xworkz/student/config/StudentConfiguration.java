package com.xworkz.student.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.student")
public class StudentConfiguration {

    public StudentConfiguration(){
        System.out.println("Student configuration class Invoked");
    }




}
