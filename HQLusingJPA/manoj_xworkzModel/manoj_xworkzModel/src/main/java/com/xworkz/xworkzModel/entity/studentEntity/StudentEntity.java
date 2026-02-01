package com.xworkz.xworkzModel.entity.studentEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String name;
    private String email;
    private Long mobile;
    private String gender;
    private LocalDate dob;
    private String courseMode;   // Online / Offline
    private LocalDate joiningDate;
    private boolean active;
    private int batchId;
}
