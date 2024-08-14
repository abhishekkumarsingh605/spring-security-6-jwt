package com.springsecurity.springsecurity.repo;

import com.springsecurity.springsecurity.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
