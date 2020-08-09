package com.rds.java.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	private Integer id;
	private String name;
	private String email;
}
