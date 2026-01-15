package com.xworkz.clothing_company.services;

import com.xworkz.clothing_company.dao.ClothingDao;
import com.xworkz.clothing_company.dao.ClothingDaoImpl;
import com.xworkz.clothing_company.dto.ClothingDto;
import com.xworkz.clothing_company.entity.ClothingEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
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

        }else


        return "false";
    }

    @Override
    public String getClothTypaeById(int i) {
        if (i!=0){
            String istype=clothingDao.getClothTypeById(i);
            return istype;
        }else
        return "false";
    }

    @Override
    public List<ClothingDto> getAllClothing() {

        List<ClothingEntity> getAll=clothingDao.getAllClothingDetaisl();
        ClothingDto clothingDto=new ClothingDto();

        if (getAll!=null){
            return getAll;
        }


        return Collections.emptyList();

    }


}

