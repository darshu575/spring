package com.xworkz.clothing_company;

import com.xworkz.clothing_company.dto.ClothingDto;
import com.xworkz.clothing_company.services.ClothingService;
import com.xworkz.clothing_company.services.ClothingServiceImpl;

import java.util.List;

public class ClothingRunner {
    public static void main(String[] args) {
        System.out.println("main Started");

        ClothingService clothingService= new ClothingServiceImpl();
        ClothingDto clothingDto=new ClothingDto();
        clothingDto.setClothId(6);
        clothingDto.setClothName("t shirt");
        clothingDto.setBrand("puma");
        clothingDto.setType("full tshirt");
        clothingDto.setSize("xl");
        clothingDto.setColor("red");
        clothingDto.setPrice(1000);
        clothingDto.setClothingOwner("srujan");
        clothingDto.setIsAvailable("no");
        System.out.println(clothingDto);
//        boolean isSaved=clothingService.ValidateAndSave(clothingDto);
//        if (isSaved){
//            System.out.println("Saved Details is="+isSaved);
//        }

        System.out.println("1 : Get ClothNameByClothID");
        String clothName=clothingService.getClothNameAndValidate(1);
        System.out.println("clothing Name="+clothName);


        System.out.println(" 2 : Get ClothTypeByClothID");



        System.out.println("Main Ended");

    }
}
