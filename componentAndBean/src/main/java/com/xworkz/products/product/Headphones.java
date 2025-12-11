package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Headphones {
    private int headphoneId;
    private String makerName;
    private String edition;
    private String audioChip;
    private int batteryHours;
    private String buildMaterial;
    private int retailPrice;
    private String supportDuration;

    @Override
    public String toString() {
        return "Headphones{" +
                "headphoneId=" + headphoneId +
                ", makerName='" + makerName + '\'' +
                ", edition='" + edition + '\'' +
                ", audioChip='" + audioChip + '\'' +
                ", batteryHours=" + batteryHours +
                ", buildMaterial='" + buildMaterial + '\'' +
                ", retailPrice=" + retailPrice +
                ", supportDuration='" + supportDuration + '\'' +
                '}';
    }
}
