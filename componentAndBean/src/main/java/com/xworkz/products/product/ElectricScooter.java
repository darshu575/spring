package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ElectricScooter {
    private int scooterId;
    private String scooterBrand;
    private String scooterSeries;
    private String motorCapacity;
    private int rangeKm;
    private String batteryType;
    private int scooterPrice;
    private String serviceValidity;

    @Override
    public String toString() {
        return "ElectricScooter{" +
                "scooterId=" + scooterId +
                ", scooterBrand='" + scooterBrand + '\'' +
                ", scooterSeries='" + scooterSeries + '\'' +
                ", motorCapacity='" + motorCapacity + '\'' +
                ", rangeKm=" + rangeKm +
                ", batteryType='" + batteryType + '\'' +
                ", scooterPrice=" + scooterPrice +
                ", serviceValidity='" + serviceValidity + '\'' +
                '}';
    }
}
