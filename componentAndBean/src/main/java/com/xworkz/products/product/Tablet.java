package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Tablet {
    private int tabletId;
    private String creator;
    private String tabModel;
    private String processorType;
    private int ramCapacity;
    private String storageOption;
    private int tabPrice;
    private String warrantyDetails;

    @Override
    public String toString() {
        return "Tablet{" +
                "tabletId=" + tabletId +
                ", creator='" + creator + '\'' +
                ", tabModel='" + tabModel + '\'' +
                ", processorType='" + processorType + '\'' +
                ", ramCapacity=" + ramCapacity +
                ", storageOption='" + storageOption + '\'' +
                ", tabPrice=" + tabPrice +
                ", warrantyDetails='" + warrantyDetails + '\'' +
                '}';
    }
}
