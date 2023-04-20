package com.value.value;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValueApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(ValueApplication.class, args);
		Student student = app.getBean(Student.class);

		System.out.println(student.getName() + " " + student.getRoll());
	}

}
