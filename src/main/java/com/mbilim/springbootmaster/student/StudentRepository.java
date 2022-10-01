package com.mbilim.springbootmaster.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository implements StudentRepo{


    @Override
    public Student getStudent() {
        return  new Student(23,"Ali");
    }

    @Override
    public List<Student> getStudents() {
        return List.of(
                new Student(1,"Mehmet"),
                new Student(3,"John")
        );
    }
}
