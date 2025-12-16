package com.xworkz.student.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private String studentName;
    private Integer age;
    private Long mobileNumber;
    private String email;
    private String course;

}
