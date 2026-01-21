package com.xworkz.darshan_xworkzModul.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtpDto {



        private int id;

        private String email;

        private String otp;


        private LocalDateTime createdTime;

        // getters and setters
    }


