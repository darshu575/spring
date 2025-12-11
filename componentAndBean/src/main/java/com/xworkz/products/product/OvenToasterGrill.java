package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class OvenToasterGrill {
    private int otgId;
    private String otgBrand;
    private String otgModel;
    private String heatingType;
    private int capacityLiters;
    private String controlKnobs;
    private int otgPrice;
    private String warrantyMonths;

    @Override
    public String toString() {
        return "OvenToasterGrill{" +
                "otgId=" + otgId +
                ", otgBrand='" + otgBrand + '\'' +
                ", otgModel='" + otgModel + '\'' +
                ", heatingType='" + heatingType + '\'' +
                ", capacityLiters=" + capacityLiters +
                ", controlKnobs='" + controlKnobs + '\'' +
                ", otgPrice=" + otgPrice +
                ", warrantyMonths='" + warrantyMonths + '\'' +
                '}';
    }
}
