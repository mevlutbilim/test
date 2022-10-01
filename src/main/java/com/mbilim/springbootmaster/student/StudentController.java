package com.mbilim.springbootmaster.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    @ResponseBody
    Student getStudent(){
        return studentService.getStudent();
    }


    @RequestMapping(value = "/students",method = RequestMethod.GET)
    @ResponseBody
    List<Student> getStudents(){
        return studentService.getStudents();
    }
}
