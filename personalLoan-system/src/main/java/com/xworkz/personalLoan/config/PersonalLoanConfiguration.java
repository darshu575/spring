package com.xworkz.personalLoan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.personalLoan")
public class PersonalLoanConfiguration {

 public PersonalLoanConfiguration(){
     System.out.println("Default Constctor");
 }
}
