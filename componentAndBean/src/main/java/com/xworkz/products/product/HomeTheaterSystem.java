package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class HomeTheaterSystem {
    private int homeTheaterId;
    private String htBrand;
    private String htModel;
    private String audioSystem;
    private int speakerCount;
    private String subwooferType;
    private int htPrice;
    private String maintenanceSupport;


    @Override
    public String toString() {
        return "HomeTheaterSystem{" +
                "homeTheaterId=" + homeTheaterId +
                ", htBrand='" + htBrand + '\'' +
                ", htModel='" + htModel + '\'' +
                ", audioSystem='" + audioSystem + '\'' +
                ", speakerCount=" + speakerCount +
                ", subwooferType='" + subwooferType + '\'' +
                ", htPrice=" + htPrice +
                ", maintenanceSupport='" + maintenanceSupport + '\'' +
                '}';
    }
}
