package com.utkarsh.springh2jdbc;

import com.utkarsh.springh2jdbc.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringH2JdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringH2JdbcApplication.class, args);
        Student s = context.getBean(Student.class);
        s.setRollNo(49);
        s.setName("Utkarsh");
        s.setMarks(89);


    }

}
