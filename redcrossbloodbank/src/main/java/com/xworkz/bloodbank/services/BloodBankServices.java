package com.xworkz.bloodbank.services;

import com.xworkz.bloodbank.dto.BloodBankDto;

import java.util.Optional;

public interface BloodBankServices {

    public boolean validateAndSaveDonorAccount(BloodBankDto bloodBankDto);
    public Optional<BloodBankDto> validateAndSearchGmail(String gmail);
}
