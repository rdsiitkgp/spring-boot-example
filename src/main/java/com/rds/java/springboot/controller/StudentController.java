package com.rds.java.springboot.controller;

import java.util.Arrays;
import java.util.List;

import com.rds.java.springboot.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@RequestMapping("university/v1//students")
    public List<Student> getStudents(){
		return Arrays.asList(new Student(123, "Binod", "binod@yahoo.com"));
    }
}
