package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@NoArgsConstructor
public class WaterPurifier {
    private int purifierId;
    private String purifierBrand;
    private String purifierModel;
    private String purificationTech;
    private int storageLiters;
    private String filterMaterial;
    private int purifierPrice;
    private String guaranteeYears;

    @Override
    public String toString() {
        return "WaterPurifier{" +
                "purifierId=" + purifierId +
                ", purifierBrand='" + purifierBrand + '\'' +
                ", purifierModel='" + purifierModel + '\'' +
                ", purificationTech='" + purificationTech + '\'' +
                ", storageLiters=" + storageLiters +
                ", filterMaterial='" + filterMaterial + '\'' +
                ", purifierPrice=" + purifierPrice +
                ", guaranteeYears='" + guaranteeYears + '\'' +
                '}';
    }
}
