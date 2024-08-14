package com.springsecurity.springsecurity.service;

import com.springsecurity.springsecurity.model.Student;
import com.springsecurity.springsecurity.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
}
