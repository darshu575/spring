package com.xworkz.clothing_company.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClothingDto {

    private int clothId;
    private String clothName;
    private String brand;
    private String type;
    private String size;
    private String color;
    private int price;
    private String clothingOwner;
    private String isAvailable;




}
