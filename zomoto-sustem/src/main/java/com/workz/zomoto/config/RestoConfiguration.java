package com.workz.zomoto.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.workz.zomoto")
public class RestoConfiguration {

    public RestoConfiguration(){
        System.out.println("RestoConfiguration Object Created");
    }
}
