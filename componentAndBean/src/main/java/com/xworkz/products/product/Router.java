package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Router {
    private int routerId;
    private String networkBrand;
    private String routerModel;
    private String frequencyBand;
    private int antennaCount;
    private String connectivityType;
    private int routerPrice;
    private String replacementWarranty;

    @Override
    public String toString() {
        return "Router{" +
                "routerId=" + routerId +
                ", networkBrand='" + networkBrand + '\'' +
                ", routerModel='" + routerModel + '\'' +
                ", frequencyBand='" + frequencyBand + '\'' +
                ", antennaCount=" + antennaCount +
                ", connectivityType='" + connectivityType + '\'' +
                ", routerPrice=" + routerPrice +
                ", replacementWarranty='" + replacementWarranty + '\'' +
                '}';
    }
}
