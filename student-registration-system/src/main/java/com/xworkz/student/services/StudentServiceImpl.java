package com.xworkz.student.services;

import com.xworkz.student.dao.StudentDAo;
import com.xworkz.student.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentDAo studentDAo;
    @Override
    public boolean validateAndSave(StudentDto studentDto) {
        System.out.println("Validatuon And Save Statrted");
        boolean isInValid=false;


        if (studentDto.getStudentName() == null
                || studentDto.getStudentName().trim().length() < 3) {
            isInValid = true;
            System.out.println("Invalid Student Name");
        }

        else if (studentDto.getAge() == null
                || studentDto.getAge() < 18
                || studentDto.getAge() > 60) {
            isInValid = true;
            System.out.println("Invalid Age");
        }

        else if (studentDto.getMobileNumber() == null
                || !studentDto.getMobileNumber().toString().matches("\\d{10}")) {
            isInValid = true;
            System.out.println("Invalid Mobile Number");
        }

        else if (studentDto.getEmail() == null
                || !studentDto.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            isInValid = true;
            System.out.println("Invalid Email");
        }

        else if (studentDto.getCourse() == null
                || studentDto.getCourse().trim().length() < 3) {
            isInValid = true;
            System.out.println("Invalid Course Name");
        }

        else {
            studentDAo.save(studentDto);
            System.out.println("Student data saved successfully");
        }


        System.out.println("Validation And Save Successfully");






        return isInValid;
    }
}
