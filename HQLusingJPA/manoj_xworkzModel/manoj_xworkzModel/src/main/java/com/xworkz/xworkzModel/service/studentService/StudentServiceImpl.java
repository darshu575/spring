package com.xworkz.xworkzModel.service.studentService;

import com.xworkz.xworkzModel.dao.studentdao.StudentDao;
import com.xworkz.xworkzModel.dto.batchdto.BatchDTO;
import com.xworkz.xworkzModel.dto.studentDto.StudentDTO;

import com.xworkz.xworkzModel.entity.batchEntity.BatchEntity;
import com.xworkz.xworkzModel.entity.studentEntity.StudentEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public boolean saveStudent(StudentDTO studentDTO,Integer batchId) {
        StudentEntity entity = new StudentEntity();
        System.out.println("service saving student");

        System.out.println("service dto :");
        System.out.println(studentDTO);
        entity.setBatchId(batchId);

        System.out.println("entity :"+entity);

        BeanUtils.copyProperties(studentDTO,entity);

        System.out.println("entity after bean utils :"+entity);
        //dao
        return studentDao.saveStudent(entity);
    }

    @Override
    public List<StudentDTO> getAllStudentsByBatchId(Integer batchId) {

        System.out.println("service started to get all students..");
      List<StudentEntity> entities = studentDao.getAllStudentsByBatchId(batchId);

        System.out.println("got students...");
        if (entities == null || entities.isEmpty()) {
            return List.of();
        }
        List<StudentDTO> studentList = new ArrayList<>();

        for (StudentEntity entity : entities) {
            StudentDTO dto = new StudentDTO();

            BeanUtils.copyProperties(entity, dto);
            studentList.add(dto);
        }
        System.out.println("all students in service dto :"+studentList);
        return studentList;
    }


}
