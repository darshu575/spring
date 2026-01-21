package com.xworkz.darshan_xworkzModul.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@NamedQuery(name = "getByGmail",query = "select ref.password from userentity ref where ref.email=:ugamil")
public class UserEntity {
    @Id
    private String userName;
    private String email;
    private String phoneNumber;
    private int age;
    private String gender;
    private String address;
    private String password;
    private  String confirmPassword;
    private int count;

}
