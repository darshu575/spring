package com.xworkz.products.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class GamingConsole {
    private int consoleId;
    private String consoleBrand;
    private String generation;
    private String gpuType;
    private int storageSize;
    private String supportedResolution;
    private int consolePrice;
    private String guaranteeInfo;

    @Override
    public String toString() {
        return "GamingConsole{" +
                "consoleId=" + consoleId +
                ", consoleBrand='" + consoleBrand + '\'' +
                ", generation='" + generation + '\'' +
                ", gpuType='" + gpuType + '\'' +
                ", storageSize=" + storageSize +
                ", supportedResolution='" + supportedResolution + '\'' +
                ", consolePrice=" + consolePrice +
                ", guaranteeInfo='" + guaranteeInfo + '\'' +
                '}';
    }
}
