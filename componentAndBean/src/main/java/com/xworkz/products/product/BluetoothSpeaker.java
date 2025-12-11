package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter

public class BluetoothSpeaker {
    private int speakerId;
    private String producer;
    private String modelSeries;
    private String driverUnit;
    private int playTime;
    private String connectivity;
    private int finalPrice;
    private String maintenanceWarranty;

    @Override
    public String toString() {
        return "BluetoothSpeaker{" +
                "speakerId=" + speakerId +
                ", producer='" + producer + '\'' +
                ", modelSeries='" + modelSeries + '\'' +
                ", driverUnit='" + driverUnit + '\'' +
                ", playTime=" + playTime +
                ", connectivity='" + connectivity + '\'' +
                ", finalPrice=" + finalPrice +
                ", maintenanceWarranty='" + maintenanceWarranty + '\'' +
                '}';
    }
}
