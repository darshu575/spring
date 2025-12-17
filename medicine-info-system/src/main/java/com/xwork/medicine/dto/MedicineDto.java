package com.xwork.medicine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicineDto {

    private String medicineName;
    private  Integer medicinePrice;
    private  String medicineMg;
    private  String combination;
    private  String expiryDate;



}
