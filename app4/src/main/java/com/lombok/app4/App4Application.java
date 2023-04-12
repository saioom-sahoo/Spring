package com.lombok.app4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App4Application {

	public static void main(String[] args) {
		var app = SpringApplication.run(App4Application.class, args);
		Student student = app.getBean(Student.class);

		student.setName("subha");
		student.setRoll(100);

		System.out.println(student);

	}

}
