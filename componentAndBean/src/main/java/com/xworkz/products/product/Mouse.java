package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Mouse {
    private int mouseId;
    private String mouseBrand;
    private String mouseModel;
    private String sensorType;
    private int dpiLevel;
    private String connectionType;
    private int mousePrice;
    private String warrantyTerm;

    @Override
    public String toString() {
        return "Mouse{" +
                "mouseId=" + mouseId +
                ", mouseBrand='" + mouseBrand + '\'' +
                ", mouseModel='" + mouseModel + '\'' +
                ", sensorType='" + sensorType + '\'' +
                ", dpiLevel=" + dpiLevel +
                ", connectionType='" + connectionType + '\'' +
                ", mousePrice=" + mousePrice +
                ", warrantyTerm='" + warrantyTerm + '\'' +
                '}';
    }
}
