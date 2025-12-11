package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class VacuumCleaner {
    private int vacuumId;
    private String vacuumBrand;
    private String vacuumModel;
    private String suctionType;
    private int powerWatts;
    private String dustHolder;
    private int vacuumPrice;
    private String serviceWarrantyPeriod;

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "vacuumId=" + vacuumId +
                ", vacuumBrand='" + vacuumBrand + '\'' +
                ", vacuumModel='" + vacuumModel + '\'' +
                ", suctionType='" + suctionType + '\'' +
                ", powerWatts=" + powerWatts +
                ", dustHolder='" + dustHolder + '\'' +
                ", vacuumPrice=" + vacuumPrice +
                ", serviceWarrantyPeriod='" + serviceWarrantyPeriod + '\'' +
                '}';
    }
}
