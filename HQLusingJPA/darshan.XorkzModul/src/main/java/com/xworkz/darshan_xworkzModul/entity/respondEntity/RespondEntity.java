package com.xworkz.darshan_xworkzModul.entity.respondEntity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "respond")
public class RespondEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int respondID;
    private String memberName;
    private String email;
    private  String number;
    private  String attendanceStatus;
    private String availableDate;
    private String comments;
}
