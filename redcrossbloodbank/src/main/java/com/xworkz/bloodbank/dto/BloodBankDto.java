package com.xworkz.bloodbank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BloodBankDto {
      private String donorAccountID;
      private String donorFirstName;
      private String donorLastName;
      private  String userName;
      private  String donorDob;
      private  int donorZipCode;
      private long donorPhoneNumber;
      private String donorGmail;
      private String password;
      private String confirmPassword;




}
