package com.xworkz.products.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = " com.xworkz.products")
public class ProductConfiguration {


    public ProductConfiguration() {
        System.out.println("Default Constructor ");


    }
}
