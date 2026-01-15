package com.xworkz.clothing_company.dao;

import com.xworkz.clothing_company.entity.ClothingEntity;

import java.util.List;

public interface ClothingDao {
    boolean save(ClothingEntity clothingEntity);

    String getClothNameByClothId(int id);


    String getClothTypeById(int i);

    List<ClothingEntity> getAllClothingDetaisl();

}
