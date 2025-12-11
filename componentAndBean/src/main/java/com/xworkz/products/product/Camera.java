package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Camera {

    private int cameraId;
    private String cameraBrand;
    private String modelType;
    private String sensorSize;
    private int megaPixels;
    private String lensType;
    private int cameraCost;
    private String warrantyDuration;

    @Override
    public String toString() {
        return "Camera{" +
                "cameraId=" + cameraId +
                ", cameraBrand='" + cameraBrand + '\'' +
                ", modelType='" + modelType + '\'' +
                ", sensorSize='" + sensorSize + '\'' +
                ", megaPixels=" + megaPixels +
                ", lensType='" + lensType + '\'' +
                ", cameraCost=" + cameraCost +
                ", warrantyDuration='" + warrantyDuration + '\'' +
                '}';
    }
}
