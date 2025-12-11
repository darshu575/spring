package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Drone {
    private int droneId;
    private String droneBrand;
    private String droneModel;
    private String flightController;
    private int flightTime;
    private String cameraSupport;
    private int dronePrice;
    private String serviceGuarantee;

    @Override
    public String toString() {
        return "Drone{" +
                "droneId=" + droneId +
                ", droneBrand='" + droneBrand + '\'' +
                ", droneModel='" + droneModel + '\'' +
                ", flightController='" + flightController + '\'' +
                ", flightTime=" + flightTime +
                ", cameraSupport='" + cameraSupport + '\'' +
                ", dronePrice=" + dronePrice +
                ", serviceGuarantee='" + serviceGuarantee + '\'' +
                '}';
    }
}
