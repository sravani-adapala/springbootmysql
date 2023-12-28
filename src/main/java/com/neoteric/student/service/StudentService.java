package com.neoteric.student.service;

import com.neoteric.student.model.StudentEntity;
import com.neoteric.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<StudentEntity> getStudent() {
        return studentRepository.findAll();

    }
}
