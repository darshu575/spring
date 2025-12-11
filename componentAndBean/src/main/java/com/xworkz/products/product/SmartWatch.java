package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SmartWatch {
    private int watchId;
    private String brandTitle;
    private String modelCode;
    private String sensorType;
    private int storageCapacity;
    private String strapType;
    private int salePrice;
    private String warrantyInfo;

    @Override
    public String toString() {
        return "SmartWatch{" +
                "watchId=" + watchId +
                ", brandTitle='" + brandTitle + '\'' +
                ", modelCode='" + modelCode + '\'' +
                ", sensorType='" + sensorType + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", strapType='" + strapType + '\'' +
                ", salePrice=" + salePrice +
                ", warrantyInfo='" + warrantyInfo + '\'' +
                '}';
    }
}
