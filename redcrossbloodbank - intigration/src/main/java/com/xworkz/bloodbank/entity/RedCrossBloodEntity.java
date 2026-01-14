package com.xworkz.bloodbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedQueries(@NamedQuery(name = "SearchByEmail",query = "select ref  from RedCrossBloodEntity ref where ref.donorGmail=:dgmail"))
@Table(name = "blood_bank")
public class RedCrossBloodEntity {
    @Id
    @Column(name = "donor_accountId")
    private String donorAccountID;
    @Column(name = "donor_first_name")
    private String donorFirstName;
    @Column(name = "donor_last_name")
    private String donorLastName;
    @Column(name = "user_name")
    private  String userName;
    @Column(name = "donor_dob")
    private  String donorDob;
    @Column(name = "donor_zip_code")
    private  int donorZipCode;
    @Column(name = "donor_phone_number")
    private long donorPhoneNumber;
    @Column(name = "donor_gmail")
    private String donorGmail;
    @Column(name = "password")
    private String password;
    @Column(name = "confirm_password")
    private String confirmPassword;


}
