package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Keyboard {
    private int keyboardId;
    private String keyboardBrand;
    private String keyType;
    private String switchType;
    private int keyCount;
    private String lightingType;
    private int keyboardPrice;
    private String validity;

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardId=" + keyboardId +
                ", keyboardBrand='" + keyboardBrand + '\'' +
                ", keyType='" + keyType + '\'' +
                ", switchType='" + switchType + '\'' +
                ", keyCount=" + keyCount +
                ", lightingType='" + lightingType + '\'' +
                ", keyboardPrice=" + keyboardPrice +
                ", validity='" + validity + '\'' +
                '}';
    }
}
