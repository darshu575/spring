package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Printer {
    private int printerId;
    private String printerBrand;
    private String printerModel;
    private String printTech;
    private int ppmSpeed;
    private String pageSize;
    private int printerPrice;
    private String supportWarranty;

    @Override
    public String toString() {
        return "Printer{" +
                "printerId=" + printerId +
                ", printerBrand='" + printerBrand + '\'' +
                ", printerModel='" + printerModel + '\'' +
                ", printTech='" + printTech + '\'' +
                ", ppmSpeed=" + ppmSpeed +
                ", pageSize='" + pageSize + '\'' +
                ", printerPrice=" + printerPrice +
                ", supportWarranty='" + supportWarranty + '\'' +
                '}';
    }
}
