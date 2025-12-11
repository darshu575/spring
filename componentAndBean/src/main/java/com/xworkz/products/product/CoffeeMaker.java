package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CoffeeMaker {
    private int coffeeMakerId;
    private String cmBrand;
    private String cmModel;
    private String brewingTech;
    private int waterCapacity;
    private String bodyMaterial;
    private int cmPrice;
    private String warrantyInfoDetails;

    @Override
    public String toString() {
        return "CoffeeMaker{" +
                "coffeeMakerId=" + coffeeMakerId +
                ", cmBrand='" + cmBrand + '\'' +
                ", cmModel='" + cmModel + '\'' +
                ", brewingTech='" + brewingTech + '\'' +
                ", waterCapacity=" + waterCapacity +
                ", bodyMaterial='" + bodyMaterial + '\'' +
                ", cmPrice=" + cmPrice +
                ", warrantyInfoDetails='" + warrantyInfoDetails + '\'' +
                '}';
    }
}
