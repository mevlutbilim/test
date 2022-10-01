package com.mbilim.springbootmaster.student;

import java.util.List;

public interface StudentRepo {
    Student getStudent();

    List<Student> getStudents();
}
