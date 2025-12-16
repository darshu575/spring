package com.xworkz.hospital;

import com.xworkz.hospital.config.HospitalConfiguration;
import com.xworkz.hospital.dao.HospitalDAo;
import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.services.HospitalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("main satrted ");

        HospitalDto hospitalDto=new HospitalDto("darshan",23,9019828925L,"onkarappa","Fiver");
        HospitalDto hospitalDto1=new HospitalDto("darshan",23,90198289252L,"onkarappa","Fiver");



        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(HospitalConfiguration.class);
        HospitalService service=applicationContext.getBean(HospitalService.class);
        service.validateAndSave(hospitalDto1);


        System.out.println("Main ended");
    }
}
