package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Refrigerator {
    private int fridgeId;
    private String brandName;
    private String variant;
    private String compressorType;
    private int starRating;
    private String capacity;
    private int sellingPrice;
    private String warrantyPeriod;

    @Override
    public String toString() {
        return "Refrigerator{" +
                "fridgeId=" + fridgeId +
                ", brandName='" + brandName + '\'' +
                ", variant='" + variant + '\'' +
                ", compressorType='" + compressorType + '\'' +
                ", starRating=" + starRating +
                ", capacity='" + capacity + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", warrantyPeriod='" + warrantyPeriod + '\'' +
                '}';
    }
}
