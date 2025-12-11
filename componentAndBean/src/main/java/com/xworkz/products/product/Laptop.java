package com.xworkz.products.product;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import sun.reflect.CallerSensitive;
@AllArgsConstructor
@NoArgsConstructor

public class Laptop {

    private int productId;
    private String brand;
    private String model;
   private String processor;
   private int ram;
   private String storage;
     private int price;
    private String   warranty;

    @Override
    public String toString() {
        return "Laptop{" +
                "productId=" + productId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage='" + storage + '\'' +
                ", price=" + price +
                ", warranty='" + warranty + '\'' +
                '}';
    }
}
