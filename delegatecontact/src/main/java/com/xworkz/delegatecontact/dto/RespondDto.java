package com.xworkz.delegatecontact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
 @AllArgsConstructor
@NoArgsConstructor
public class RespondDto {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String  response;
    private String message;
    private int  eventId;
    private String tpoEmail;
}
