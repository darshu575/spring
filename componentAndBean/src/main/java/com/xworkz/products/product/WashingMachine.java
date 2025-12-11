package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class WashingMachine {
    private int wmId;
    private String companyName;
    private String version;
    private String motorType;
    private int drumSize;
    private String loadType;
    private int priceTag;
    private String coverage;


    @Override
    public String toString() {
        return "WashingMachine{" +
                "wmId=" + wmId +
                ", companyName='" + companyName + '\'' +
                ", version='" + version + '\'' +
                ", motorType='" + motorType + '\'' +
                ", drumSize=" + drumSize +
                ", loadType='" + loadType + '\'' +
                ", priceTag=" + priceTag +
                ", coverage='" + coverage + '\'' +
                '}';
    }
}
