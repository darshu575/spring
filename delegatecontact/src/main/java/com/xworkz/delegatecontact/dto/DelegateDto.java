package com.xworkz.delegatecontact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
 @NoArgsConstructor
public class DelegateDto {

    private String fullName;
    private String email;
    private  int age;
    private  String phoneNumber;
    private String delegateType;
}
