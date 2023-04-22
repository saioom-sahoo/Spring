package com.requried.requried;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RequriedApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(RequriedApplication.class, args);
		Student student = app.getBean(Student.class);
		System.out.println(student.getName() + " " + student.getRoll());
	}

}
