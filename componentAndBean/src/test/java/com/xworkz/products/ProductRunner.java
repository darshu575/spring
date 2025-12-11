package com.xworkz.products;


import com.xworkz.products.config.ProductConfiguration;
import com.xworkz.products.product.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.sql.Ref;
import java.util.List;


public class ProductRunner {
    public static void main(String[] args) {
        System.out.println("main stated");

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ProductConfiguration.class);
        List<AirPurifier> airPurifiers=applicationContext.getBean("p1",List.class);
        airPurifiers.stream().forEach(System.out::println);
        System.out.println("_______________________________");

       List<AirConditioner> airConditioners= applicationContext.getBean("p2", List.class);
       airConditioners.stream().forEach(System.out::println);
        System.out.println("_______________________________");

         List<BluetoothSpeaker> bluetoothSpeakers=applicationContext.getBean("p3", List.class);
         bluetoothSpeakers.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<Camera> cameraList=applicationContext.getBean("p4", List.class);
        cameraList.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<CoffeeMaker> coffeeMakers=applicationContext.getBean("p5", List.class);
        coffeeMakers.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<Drone> drones=applicationContext.getBean("p6", List.class);
        drones.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<ElectricKettle> electricKettles=applicationContext.getBean("p7", List.class);
        electricKettles.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<ElectricScooter> electricScooters=applicationContext.getBean("p8", List.class);
        electricScooters.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<FitnessBand> fitnessBands=applicationContext.getBean("p9", List.class);
        fitnessBands.stream().forEach(System.out::println);
        System.out.println("_______________________________");


        List<GamingConsole> gamingConsoles=applicationContext.getBean("p10", List.class);
        gamingConsoles.stream().forEach(System.out::println);
        System.out.println("_______________________________");

       List<HairDryer> hairDryers=applicationContext.getBean("p11", List.class);
        hairDryers.stream().forEach(System.out::println);


        List<Headphones> headphones=applicationContext.getBean("p12", List.class);
        headphones.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<HomeTheaterSystem> homeTheaterSystems=applicationContext.getBean("p13", List.class);
        homeTheaterSystems.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<InductionStove> inductionStoves=applicationContext.getBean("p14", List.class);
        inductionStoves.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<Keyboard> keyboards=applicationContext.getBean("p15", List.class);
        keyboards.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<Laptop> laptops=applicationContext.getBean("p16", List.class);
        laptops.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<MicrowaveOven> microwaveOvens=applicationContext.getBean("p17", List.class);
        microwaveOvens.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<MobilePhone> mobilePhones=applicationContext.getBean("p18", List.class);
        mobilePhones.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<Mouse> mouseList=applicationContext.getBean("p19", List.class);
        mouseList.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<OvenToasterGrill>  ovenToasterGrills=applicationContext.getBean("p20", List.class);
        ovenToasterGrills.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<PowerBank>  powerBanks=applicationContext.getBean("p21", List.class);
        powerBanks.stream().forEach(System.out::println);
        System.out.println("_______________________________");


        List<Printer>  printers=applicationContext.getBean("p22", List.class);
        printers.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<Projector>  projectors=applicationContext.getBean("p23", List.class);
        projectors.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<Refrigerator>  refrigerators=applicationContext.getBean("p24", List.class);
        refrigerators.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<Router>  routers=applicationContext.getBean("p25", List.class);
        routers.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<SmartSpeaker>  smartSpeakers=applicationContext.getBean("p26", List.class);
        smartSpeakers.stream().forEach(System.out::println);
        System.out.println("_______________________________");


        List<SmartWatch>  smartWatches=applicationContext.getBean("p27", List.class);
        smartWatches.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<Tablet>  tablets=applicationContext.getBean("p28", List.class);
        tablets.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<Telivision>  telivisions=applicationContext.getBean("p29", List.class);
        telivisions.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<VacuumCleaner>  vacuumCleaners=applicationContext.getBean("p30", List.class);
        vacuumCleaners.stream().forEach(System.out::println);
        System.out.println("_______________________________");


        List<WashingMachine>  washingMachines=applicationContext.getBean("31", List.class);
        washingMachines.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<WaterHeater>  waterHeaters=applicationContext.getBean("p32", List.class);
        waterHeaters.stream().forEach(System.out::println);
        System.out.println("_______________________________");

        List<WaterPurifier>  waterPurifiers=applicationContext.getBean("p33", List.class);
        waterPurifiers.stream().forEach(System.out::println);
        System.out.println("_______________________________");


















    }
}
