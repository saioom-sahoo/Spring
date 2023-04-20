package com.expresslanguage.expresslanguage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpresslanguageApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(ExpresslanguageApplication.class, args);
		Student student = app.getBean(Student.class);
		System.out.println(student.getName());
		System.out.println(student.getRoll());
		System.out.println(student.getFee());

	}

}
