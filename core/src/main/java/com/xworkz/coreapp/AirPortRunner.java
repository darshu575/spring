package com.xworkz.coreapp;

import com.xworkz.coreapp.autowired.Aiport;
import com.xworkz.coreapp.autowired.Terminal;
import com.xworkz.coreapp.configuration.CoreConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AirPortRunner {
    public static void main(String[] args) {


        System.out.println("Main started");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfiguration.class);


       Aiport airport = applicationContext.getBean( Aiport.class);
        System.out.println(airport);

        Terminal terminal = airport.getTerminal();
        System.out.println(terminal);

        Aiport aiport1=applicationContext.getBean(Aiport.class);
       Terminal terminal1= aiport1.getTerminal();
//       terminal1.setId(1);
//       terminal1.setName("terminal1");
//       terminal1.setArea("20sqrft");
        System.out.println(terminal1);
        aiport1.setAirportId(2);
        aiport1.setAirPortName("bengluru airport");
        aiport1.setAirportarea("30sqrft");
        System.out.println(aiport1);

        Aiport aiport2=applicationContext.getBean(Aiport.class);
        //   aiport2.getTerminal();
        aiport2.setAirportId(3);
        aiport2.setAirPortName("maglurur");
        aiport2.setAirportarea("13srft");
        System.out.println(aiport2);



        System.out.println("Main Ended");

    }
}
