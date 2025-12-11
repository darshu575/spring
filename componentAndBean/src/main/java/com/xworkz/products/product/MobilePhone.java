package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class MobilePhone {
    private int phoneId;
    private String company;
    private String phoneName;
    private String chipset;
    private int ramSize;
    private String internalStorage;
    private int amount;
    private String servicePeriod;

    @Override
    public String toString() {
        return "MobilePhone{" +
                "phoneId=" + phoneId +
                ", company='" + company + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", chipset='" + chipset + '\'' +
                ", ramSize=" + ramSize +
                ", internalStorage='" + internalStorage + '\'' +
                ", amount=" + amount +
                ", servicePeriod='" + servicePeriod + '\'' +
                '}';
    }
}
