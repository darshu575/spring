package com.xworkz.patient;

import com.xworkz.App;
import com.xworkz.patient.config.PatientConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PatientRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(PatientConfiguration.class);
       Patient patient= applicationContext.getBean(Patient.class);
       patient.getPatientAddress();
    }
}
