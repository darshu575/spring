package com.xworkz.darshan_xworkzModul.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDto {


    private String userName;
    private String email;
    private Long phoneNumber;
    private int age;
    private String gender;
    private String address;
    private String password;
    private  String confirmPassword;


}
