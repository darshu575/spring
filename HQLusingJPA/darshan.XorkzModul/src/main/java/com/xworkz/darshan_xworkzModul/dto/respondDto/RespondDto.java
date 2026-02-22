package com.xworkz.darshan_xworkzModul.dto.respondDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespondDto {

    private String memberName;
    private String email;
    private  String number;
    private  String attendanceStatus;
    private String availableDate;
    private String comments;
}
