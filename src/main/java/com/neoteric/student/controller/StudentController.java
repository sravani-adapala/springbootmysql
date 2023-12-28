package com.neoteric.student.controller;

import com.neoteric.student.SchoolService;
import com.neoteric.student.model.StudentEntity;
import com.neoteric.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/getStudents")
    public List<StudentEntity> getStudent() {
        return studentService.getStudent();
    }
    @GetMapping(value = "/getTeachercount")
    public int getTeachercount(){
        SchoolService ss=new SchoolService();
        return ss.getTeachercount();
    }
    @GetMapping(value = "/getadd")
    public int getadd(){
        SchoolService ss=new SchoolService();
        return ss.getadd();
    }
    @GetMapping(value = "/getremove")
    public int getremove(){
        SchoolService ss=new SchoolService();
        return ss.getremove();
    }
}
