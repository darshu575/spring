package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Projector {
    private int projectorId;
    private String projectorBrand;
    private String projectorName;
    private String lampType;
    private int brightnessLevel;
    private String resolutionSupport;
    private int projectorCost;
    private String productWarranty;

    @Override
    public String toString() {
        return "Projector{" +
                "projectorId=" + projectorId +
                ", projectorBrand='" + projectorBrand + '\'' +
                ", projectorName='" + projectorName + '\'' +
                ", lampType='" + lampType + '\'' +
                ", brightnessLevel=" + brightnessLevel +
                ", resolutionSupport='" + resolutionSupport + '\'' +
                ", projectorCost=" + projectorCost +
                ", productWarranty='" + productWarranty + '\'' +
                '}';
    }
}
