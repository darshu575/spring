package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class SmartSpeaker {
    private int smartSpeakerId;
    private String speakerBrand;
    private String seriesName;
    private String voiceChip;
    private int micCount;
    private String soundProfile;
    private int priceValue;
    private String assurance;

    @Override
    public String toString() {
        return "SmartSpeaker{" +
                "smartSpeakerId=" + smartSpeakerId +
                ", speakerBrand='" + speakerBrand + '\'' +
                ", seriesName='" + seriesName + '\'' +
                ", voiceChip='" + voiceChip + '\'' +
                ", micCount=" + micCount +
                ", soundProfile='" + soundProfile + '\'' +
                ", priceValue=" + priceValue +
                ", assurance='" + assurance + '\'' +
                '}';
    }
}
