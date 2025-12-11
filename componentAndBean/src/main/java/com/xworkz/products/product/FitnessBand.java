package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class FitnessBand {
    private int bandId;
    private String bandBrand;
    private String bandName;
    private String trackingSensor;
    private int batteryLifeDays;
    private String bandMaterial;
    private int bandPrice;
    private String protectionWarranty;

    @Override
    public String toString() {
        return "FitnessBand{" +
                "bandId=" + bandId +
                ", bandBrand='" + bandBrand + '\'' +
                ", bandName='" + bandName + '\'' +
                ", trackingSensor='" + trackingSensor + '\'' +
                ", batteryLifeDays=" + batteryLifeDays +
                ", bandMaterial='" + bandMaterial + '\'' +
                ", bandPrice=" + bandPrice +
                ", protectionWarranty='" + protectionWarranty + '\'' +
                '}';
    }
}
