package com.xworkz.student.services;

import com.xworkz.student.dto.StudentDto;

public interface StudentService {
    boolean validateAndSave(StudentDto studentDto);
}
