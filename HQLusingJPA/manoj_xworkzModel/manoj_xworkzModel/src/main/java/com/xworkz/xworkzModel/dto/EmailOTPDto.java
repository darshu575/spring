package com.xworkz.xworkzModel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailOTPDto {

    private String email;
    private String otp;
    private LocalDateTime createdTime;

}
