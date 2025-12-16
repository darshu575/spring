package com.xworkz.student.dao;

import com.xworkz.student.constant.DBConstant;
import com.xworkz.student.dto.StudentDto;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
@Component
public class StudentDAoImpl implements StudentDAo{
    @SneakyThrows
    @Override
    public void save(StudentDto studentDto) {
        String insertQuery = "insert into student(student_name,age,mobile_number,email,course) values(?,?,?,?,?)";

        try(Connection connection= DriverManager.getConnection(DBConstant.URL.getProp(),DBConstant.USERNAME.getProp(),DBConstant.PASSWORD.getProp());
            PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
        ){
            preparedStatement.setString(1,studentDto.getStudentName());
            preparedStatement.setInt(2,studentDto.getAge());
            preparedStatement.setLong(3,studentDto.getMobileNumber());
            preparedStatement.setString(4,studentDto.getEmail());
            preparedStatement.setString(5,studentDto.getCourse());
           int rows= preparedStatement.executeUpdate();
            System.out.println("RowsEffeted"+rows);



        }


    }
}
