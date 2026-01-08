package com.xworkz.clothing_company.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class ClothingEntity {
@Id
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
