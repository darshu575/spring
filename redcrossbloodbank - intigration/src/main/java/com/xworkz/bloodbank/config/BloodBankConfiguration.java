package com.xworkz.bloodbank.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basePackages = "com.xworkz.bloodbank")
public class BloodBankConfiguration {

    public BloodBankConfiguration(){
        System.out.println("BloodBankConfiguration contractor invoked");
    }
}
