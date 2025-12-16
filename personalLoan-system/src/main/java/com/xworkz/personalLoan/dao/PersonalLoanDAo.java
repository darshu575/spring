package com.xworkz.personalLoan.dao;

import com.xworkz.personalLoan.dto.PersonalLoanDto;
import org.springframework.stereotype.Component;

@Component
public interface PersonalLoanDAo {

    void save(PersonalLoanDto personalLoanDto);
}
