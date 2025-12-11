package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ElectricKettle {
    private int kettleId;
    private String kettleBrand;
    private String kettleModel;
    private String heatingElement;
    private int kettleCapacity;
    private String bodyType;
    private int kettlePrice;
    private String safetyWarranty;

    @Override
    public String toString() {
        return "ElectricKettle{" +
                "kettleId=" + kettleId +
                ", kettleBrand='" + kettleBrand + '\'' +
                ", kettleModel='" + kettleModel + '\'' +
                ", heatingElement='" + heatingElement + '\'' +
                ", kettleCapacity=" + kettleCapacity +
                ", bodyType='" + bodyType + '\'' +
                ", kettlePrice=" + kettlePrice +
                ", safetyWarranty='" + safetyWarranty + '\'' +
                '}';
    }
}
