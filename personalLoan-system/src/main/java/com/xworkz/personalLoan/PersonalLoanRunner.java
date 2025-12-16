package com.xworkz.personalLoan;

import com.xworkz.personalLoan.config.PersonalLoanConfiguration;
import com.xworkz.personalLoan.dto.PersonalLoanDto;
import com.xworkz.personalLoan.services.PersoanlLoanService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonalLoanRunner {
    public static void main(String[] args) {
        PersonalLoanDto personalLoanDto=new
                PersonalLoanDto("vinayak", 9483752304L,"gjjpd0014F", 911545258925L,24,500);

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(PersonalLoanConfiguration.class);

      PersoanlLoanService persoanlLoanService=  applicationContext.getBean(PersoanlLoanService.class);
      persoanlLoanService.validateAndSave(personalLoanDto);
    }
}
