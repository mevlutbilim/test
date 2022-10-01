package com.mbilim.springbootmaster.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(
             StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    Student getStudent(){
        return studentRepo.getStudent();
    }

    List<Student> getStudents(){
        return studentRepo.getStudents();
    }
}
