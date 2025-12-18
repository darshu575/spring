package com.workz.zomoto.services;

import com.workz.zomoto.dao.RestourentDAo;
import com.workz.zomoto.dto.RestourentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RestourentServiceImpl implements RestourentServices{
    @Autowired
    RestourentDAo restourentDAo;

    @Override
    public boolean validationAndSave(RestourentDto restourentDto) {

        boolean isInValid = false;

        if (restourentDto.getRestourentName() == null
                || restourentDto.getRestourentName().trim().length() < 3) {
            isInValid = true;
            System.out.println("Invalid Restaurant Name");
        }

        else if (restourentDto.getOwnerName() == null) {
            System.out.println(restourentDto.getOwnerName() );
            isInValid = true;
            System.out.println("Invalid Owner Name");
        }

        else if (restourentDto.getAge() == null
                || restourentDto.getAge() < 18
                || restourentDto.getAge() > 70) {
            isInValid = true;
            System.out.println("Invalid Age");
        }

        else if (restourentDto.getGmail() == null
                || !restourentDto.getGmail().contains("@gmail.com")) {
            isInValid = true;
            System.out.println("Invalid Gmail");
        }

        else if (restourentDto.getNumber() == null
                || restourentDto.getNumber().toString().length() != 10) {
            isInValid = true;
            System.out.println("Invalid Mobile Number");
        }

        else if (restourentDto.getCountry() == null
                || restourentDto.getCountry().trim().length() < 3) {
            isInValid = true;
            System.out.println("Invalid Country");
        }

        else if (restourentDto.getState() == null
                || restourentDto.getState().trim().length() < 3) {
            isInValid = true;
            System.out.println("Invalid State");
        }

        else if (restourentDto.getCity() == null
                || restourentDto.getCity().trim().length() < 3) {
            isInValid = true;
            System.out.println("Invalid City");
        }

        else if (restourentDto.getBranch() == null
                || restourentDto.getBranch().trim().length() < 2) {
            isInValid = true;
            System.out.println("Invalid Branch");
        }

        else if (restourentDto.getGst() == null
                || restourentDto.getGst().length() == 15) {
            isInValid = true;
            System.out.println("Invalid GST Number");
        }

        else {
            return restourentDAo.save(restourentDto);

        }

        if (!isInValid){
            return true;
        }
        return false;
    }
}
