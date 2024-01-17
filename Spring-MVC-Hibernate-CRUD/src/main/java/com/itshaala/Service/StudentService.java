package com.itshaala.Service;

import com.itshaala.Dao.StudentDao;
import com.itshaala.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;
    public void addStudent(Student student){
        studentDao.addStudent(student);
    }
}
