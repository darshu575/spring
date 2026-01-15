package com.xworkz.clothing_company.services;

import com.xworkz.clothing_company.dto.ClothingDto;

import java.util.List;

public interface ClothingService {
    boolean ValidateAndSave(ClothingDto clothingDto);

    String getClothNameAndValidate(int id);


    String getClothTypaeById(int i);

    List<ClothingDto> getAllClothing();
}
