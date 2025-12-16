package com.xworkz.products;

import com.xworkz.products.config.ProductConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductRunner {
    public static void main(String[] args) {
        System.out.println(" Main  started ");

   ApplicationContext applicationContext = new
           AnnotationConfigApplicationContext(ProductConfiguration.class);
        applicationContext.getBean(" ");


        System.out.println("main  ended ");
    }
}
