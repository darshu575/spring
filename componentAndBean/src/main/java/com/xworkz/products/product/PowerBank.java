package com.xworkz.products.product;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PowerBank {
    private int powerBankId;
    private String pbBrand;
    private String modelVariant;
    private String batteryType;
    private int capacityMah;
    private String outputPorts;
    private int pbPrice;
    private String servicePeriodInfo;

    @Override
    public String toString() {
        return "PowerBank{" +
                "powerBankId=" + powerBankId +
                ", pbBrand='" + pbBrand + '\'' +
                ", modelVariant='" + modelVariant + '\'' +
                ", batteryType='" + batteryType + '\'' +
                ", capacityMah=" + capacityMah +
                ", outputPorts='" + outputPorts + '\'' +
                ", pbPrice=" + pbPrice +
                ", servicePeriodInfo='" + servicePeriodInfo + '\'' +
                '}';
    }
}
