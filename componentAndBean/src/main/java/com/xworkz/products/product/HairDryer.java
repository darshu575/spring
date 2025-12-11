package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class HairDryer {

    private int dryerId;
    private String dryerBrand;
    private String dryerModel;
    private String motorPower;
    private int heatSettings;
    private String nozzleType;
    private int dryerPrice;
    private String replacementAssurance;

    @Override
    public String toString() {
        return "HairDryer{" +
                "dryerId=" + dryerId +
                ", dryerBrand='" + dryerBrand + '\'' +
                ", dryerModel='" + dryerModel + '\'' +
                ", motorPower='" + motorPower + '\'' +
                ", heatSettings=" + heatSettings +
                ", nozzleType='" + nozzleType + '\'' +
                ", dryerPrice=" + dryerPrice +
                ", replacementAssurance='" + replacementAssurance + '\'' +
                '}';
    }
}
