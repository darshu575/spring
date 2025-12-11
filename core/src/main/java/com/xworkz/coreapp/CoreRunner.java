package com.xworkz.coreapp;

import com.xworkz.coreapp.apps.Instragram;
import com.xworkz.coreapp.apps.WhatsApp;
import com.xworkz.coreapp.configuration.CoreConfiguration;
import com.xworkz.coreapp.internet.Internet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class CoreRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(CoreConfiguration.class);
        Internet internet=applicationContext.getBean(Internet.class);
        internet.setInternetID(1);
        internet.setName("jio");

        System.out.println("coreapp information:"+internet);
        System.out.println("Bean invoked");

       String name= applicationContext.getBean("getName",String.class);
        System.out.println(name);

       Integer id= applicationContext.getBean("getId",Integer.class);
        System.out.println(id);

        Long phonenumber=applicationContext.getBean("getPhoneNumber",Long.class);
        System.out.println(phonenumber);

        List<String> place=applicationContext.getBean("location", List.class);
        System.out.println(place);


        System.out.println("bean ended");

        System.out.println("WhatsApp runner");
       WhatsApp whatsApp=  applicationContext.getBean(WhatsApp.class);
      whatsApp.setWhatsAppId(2);
      whatsApp.setwName("WhatsApp");
        System.out.println("Whatsapp class info:"+whatsApp);

        Instragram instragram=applicationContext.getBean(Instragram.class);
        instragram.setId(1);
        instragram.setName("darshu");

        System.out.println("instragram : "+instragram);



        System.out.println("main ended");
    }
}
