package com.xworkz.products.product;


import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class AirPurifier {
    private int airPurifierId;
    private String apBrand;
    private String apModel;
    private String filterSystem;
    private int coverageArea;
    private String noiseLevel;
    private int purifierCost;
    private String serviceYears;

    @Override
    public String toString() {
        return "AirPurifier{" +
                "airPurifierId=" + airPurifierId +
                ", apBrand='" + apBrand + '\'' +
                ", apModel='" + apModel + '\'' +
                ", filterSystem='" + filterSystem + '\'' +
                ", coverageArea=" + coverageArea +
                ", noiseLevel='" + noiseLevel + '\'' +
                ", purifierCost=" + purifierCost +
                ", serviceYears='" + serviceYears + '\'' +
                '}';
    }
}
