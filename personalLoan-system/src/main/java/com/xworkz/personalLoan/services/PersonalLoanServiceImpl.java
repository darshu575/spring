package com.xworkz.personalLoan.services;

import com.xworkz.personalLoan.dao.PersonalLoanDAo;
import com.xworkz.personalLoan.dto.PersonalLoanDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonalLoanServiceImpl implements PersoanlLoanService{

    @Autowired
    PersonalLoanDAo personalLoanDAo;
    @Override
    public boolean validateAndSave(PersonalLoanDto personalLoanDto) {


        System.out.println("Validation and Save");
        boolean isInValid = false;
        if (personalLoanDto.getFullName() == null
                || personalLoanDto.getFullName().length() < 3)
            isInValid = true;


        else if (personalLoanDto.getPhoneNumber() == null
            //  || personalLoanDto.getPhoneNumber().toString().matches("\\d{10}")
        )
            isInValid = true;

        else if (personalLoanDto.getPanNumber() == null
            //   || personalLoanDto.getPanNumber().matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")
        )
            isInValid = true;

        else if (personalLoanDto.getAaddarNumber() == null
            //  || personalLoanDto.getAaddarNumber().toString().matches("\\\\d{12}")
        )
            isInValid = true;

        else if (personalLoanDto.getAge() == null
                || personalLoanDto.getAge() < 18)
            isInValid = true;

        else if (personalLoanDto.getCreditScore() == null
                || personalLoanDto.getCreditScore() < 400)
            isInValid = true;
       else {
personalLoanDAo.save(personalLoanDto);
        }
        System.out.println("validation and save ended");
       return isInValid;
    }



    }

