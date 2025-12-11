package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class MicrowaveOven {
    private int ovenId;
    private String label;
    private String modelNo;
    private String heatingTech;
    private int powerLevel;
    private String volume;
    private int costPrice;
    private String serviceWarranty;

    @Override
    public String toString() {
        return "MicrowaveOven{" +
                "ovenId=" + ovenId +
                ", label='" + label + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", heatingTech='" + heatingTech + '\'' +
                ", powerLevel=" + powerLevel +
                ", volume='" + volume + '\'' +
                ", costPrice=" + costPrice +
                ", serviceWarranty='" + serviceWarranty + '\'' +
                '}';
    }
}
