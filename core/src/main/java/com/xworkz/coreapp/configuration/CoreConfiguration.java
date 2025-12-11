package com.xworkz.coreapp.configuration;

import com.xworkz.coreapp.apps.Instragram;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.coreapp")
public class CoreConfiguration {

    public CoreConfiguration(){
        System.out.println("coreconfiguration class invoked");
    }


    // not Using Component Annotation
    @Bean
   public String getName(){
        return  "appName";
    }
    @Bean
    public  Integer getId(){
        return 1;
    }
    @Bean
    public  Long getPhoneNumber(){
        return 9018828925l;
    }
    @Bean("location")
    public  List<String>  getLocation(){
        List<String> list=new ArrayList<>();
        list.add("chitradurga");
        list.add("sira");
        list.add("tumkur");
        list.add("bengluru");
        return list;
    }




}
