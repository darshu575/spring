package com.xworkz.bloodbank.services;

import com.xworkz.bloodbank.dao.BloodBankDao;
import com.xworkz.bloodbank.dto.BloodBankDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BloodBankServiceImpl implements BloodBankServices{

    @Autowired
    BloodBankDao bloodBankDao;

    @Override
    public boolean validateAndSaveDonorAccount(BloodBankDto bloodBankDto) {
        System.out.println(bloodBankDto);
        boolean isInValid = false;

        if (bloodBankDto.getDonorAccountID() == null
        || bloodBankDto.getDonorAccountID().trim().length()<=2) {
            isInValid = true;
            System.out.println("Invalid Donor Account ID");
        }

        else if (bloodBankDto.getDonorFirstName() == null
                || bloodBankDto.getDonorFirstName().trim().length() < 3) {
            isInValid = true;
            System.out.println("Invalid Donor First Name");
        }

        else if (bloodBankDto.getDonorLastName() == null
                || bloodBankDto.getDonorLastName().trim().length() < 1) {
            isInValid = true;
            System.out.println("Invalid Donor Last Name");
        }

        else if (bloodBankDto.getUserName() == null
                || bloodBankDto.getUserName().trim().length() < 4) {
            isInValid = true;
            System.out.println("Invalid User Name");
        }

        else if (bloodBankDto.getDonorDob() == null
                || bloodBankDto.getDonorDob().trim().isEmpty()) {
            isInValid = true;
            System.out.println("Invalid Date of Birth");
        }

        else if (bloodBankDto.getDonorZipCode() <= 0
                || String.valueOf(bloodBankDto.getDonorZipCode()).length() != 6) {
            isInValid = true;
            System.out.println("Invalid Zip Code");
        }

        else if (bloodBankDto.getDonorPhoneNumber() <= 0
                || String.valueOf(bloodBankDto.getDonorPhoneNumber()).length() != 10) {
            isInValid = true;
            System.out.println("Invalid Phone Number");
        }

        else if (bloodBankDto.getDonorGmail() == null
                || !bloodBankDto.getDonorGmail().contains("@gmail.com")) {
            isInValid = true;
            System.out.println("Invalid Gmail");
        }

        else if (bloodBankDto.getPassword() == null
                || bloodBankDto.getPassword().length() < 6) {
            isInValid = true;
            System.out.println("Invalid Password");
        }

        else if (bloodBankDto.getConfirmPassword() == null
                || !bloodBankDto.getConfirmPassword().equals(bloodBankDto.getPassword())) {
            isInValid = true;
            System.out.println("Password and Confirm Password do not match");
        }

        else {
            return bloodBankDao.save(bloodBankDto);
        }

        if (!isInValid) {
            return true;
        }
        return false;

    }

    @Override
    public Optional<BloodBankDto> validateAndSearchGmail(String gmail) {
        if (gmail!=null){

        }

        return Optional.empty();
    }
}
