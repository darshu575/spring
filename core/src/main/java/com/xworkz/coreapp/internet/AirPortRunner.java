package com.xworkz.coreapp.internet;

import com.xworkz.coreapp.autowired.Aiport;
import com.xworkz.coreapp.autowired.Terminal;
import com.xworkz.coreapp.configuration.CoreConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class AirPortRunner {
    public static void main(String[] args) {


        System.out.println("Main started");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfiguration.class);


        Aiport airport = applicationContext.getBean("airport", Aiport.class);
        System.out.println(airport);
        Terminal terminal = airport.getTerminal();
        System.out.println(terminal);


        System.out.println("Main started");

    }
}
