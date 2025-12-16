package com.xworkz.hospital.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.hospital")


public class HospitalConfiguration {

    public  HospitalConfiguration(){
        System.out.println("Default HospitalConfig invoked");
    }



}
