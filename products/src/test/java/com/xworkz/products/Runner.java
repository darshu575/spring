package com.xworkz.products;

import com.xworkz.products.Example1.Institute;
import com.xworkz.products.config.ProductConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProductConfiguration.class);
       Institute institute= applicationContext.getBean(Institute.class);



    }
}
