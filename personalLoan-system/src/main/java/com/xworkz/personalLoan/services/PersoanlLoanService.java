package com.xworkz.personalLoan.services;

import com.xworkz.personalLoan.dto.PersonalLoanDto;
import org.springframework.stereotype.Component;
@Component

public interface PersoanlLoanService {

   boolean  validateAndSave(PersonalLoanDto personalLoanDto);
}
