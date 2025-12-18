package com.workz.zomoto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RestourentDto {

    private String restourentName;
    private String ownerName;
    private Integer age;
    private String gmail;
    private Long number;
    private String country;
    private String state;
    private String city;
    private String branch;
    private String gst;

}
