package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class WaterHeater
{
    private int geyserId;
    private String geyserBrand;
    private String geyserModel;
    private String heatingTech;
    private int capacityLiters;
    private String mountType;
    private int geyserCost;
    private String warrantyPlan;

    @Override
    public String toString() {
        return "WaterHeater{" +
                "geyserId=" + geyserId +
                ", geyserBrand='" + geyserBrand + '\'' +
                ", geyserModel='" + geyserModel + '\'' +
                ", heatingTech='" + heatingTech + '\'' +
                ", capacityLiters=" +capacityLiters +
                ", mountType='" + mountType + '\'' +
                ", geyserCost=" + geyserCost +
                ", warrantyPlan='" + warrantyPlan + '\'' +
                '}';
    }
}
