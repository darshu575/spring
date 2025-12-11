package com.xworkz.products.product;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter@Getter
@NoArgsConstructor
public class AirConditioner {
    private int acId;
    private String vendor;
    private String design;
    private String coolingTech;
    private int tonnage;
    private String filterType;
    private int marketPrice;
    private String guaranteePeriod;

    @Override
    public String toString() {
        return "AirConditioner{" +
                "acId=" + acId +
                ", vendor='" + vendor + '\'' +
                ", design='" + design + '\'' +
                ", coolingTech='" + coolingTech + '\'' +
                ", tonnage=" + tonnage +
                ", filterType='" + filterType + '\'' +
                ", marketPrice=" + marketPrice +
                ", guaranteePeriod='" + guaranteePeriod + '\'' +
                '}';
    }
}
