package com.utkarsh.springh2jdbc.repo;

import com.utkarsh.springh2jdbc.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {
    public void save(Student s) {
        System.out.println("Added");
    }
}
