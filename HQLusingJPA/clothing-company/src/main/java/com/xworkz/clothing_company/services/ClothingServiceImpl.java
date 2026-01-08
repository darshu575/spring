package com.xworkz.clothing_company.services;

import com.xworkz.clothing_company.dao.ClothingDao;
import com.xworkz.clothing_company.dao.ClothingDaoImpl;
import com.xworkz.clothing_company.dto.ClothingDto;
import com.xworkz.clothing_company.entity.ClothingEntity;
import org.springframework.beans.BeanUtils;

import java.util.Collections;
import java.util.List;

public class ClothingServiceImpl implements ClothingService {

    ClothingDao clothingDao = new ClothingDaoImpl();
    ClothingEntity clothingEntity = new ClothingEntity();

    @Override
    public boolean ValidateAndSave(ClothingDto clothingDto) {

        if (clothingDto != null) {

            BeanUtils.copyProperties(clothingDto, clothingEntity);

            boolean isSaved = clothingDao.save(clothingEntity);
            return isSaved;
        }


        return false;
    }

    @Override
    public String getClothNameAndValidate(int id) {
        if (id != 0) {

            String isGet = clothingDao.getClothNameByClothId(id);
            return isGet;

        }


        return "";
    }


}

