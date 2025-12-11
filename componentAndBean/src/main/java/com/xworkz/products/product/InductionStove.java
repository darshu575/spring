package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class InductionStove {
    private int inductionId;
    private String inductionBrand;
    private String inductionModel;
    private String coilType;
    private int powerLevel;
    private String panelType;
    private int inductionPrice;
    private String guaranteeValidation;

    @Override
    public String toString() {
        return "InductionStove{" +
                "inductionId=" + inductionId +
                ", inductionBrand='" + inductionBrand + '\'' +
                ", inductionModel='" + inductionModel + '\'' +
                ", coilType='" + coilType + '\'' +
                ", powerLevel=" + powerLevel +
                ", panelType='" + panelType + '\'' +
                ", inductionPrice=" + inductionPrice +
                ", guaranteeValidation='" + guaranteeValidation + '\'' +
                '}';
    }
}
