package com.xworkz.xworkzModel.dao.studentdao;


import com.xworkz.xworkzModel.entity.studentEntity.StudentEntity;

import java.util.List;

public interface StudentDao {

    boolean saveStudent(StudentEntity entity );

    List<StudentEntity> getAllStudentsByBatchId(Integer batchId);
}
