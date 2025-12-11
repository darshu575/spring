package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Telivision {
    private int tvId;
    private String maker;
    private String tvModel;
    private String graphicsEngine;
    private int refreshRate;
    private String screenType;
    private int mrp;
    private String replacementPolicy;

    @Override
    public String toString() {
        return "Telivision{" +
                "tvId=" + tvId +
                ", maker='" + maker + '\'' +
                ", tvModel='" + tvModel + '\'' +
                ", graphicsEngine='" + graphicsEngine + '\'' +
                ", refreshRate=" + refreshRate +
                ", screenType='" + screenType + '\'' +
                ", mrp=" + mrp +
                ", replacementPolicy='" + replacementPolicy + '\'' +
                '}';
    }
}
