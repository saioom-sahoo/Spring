package com.lifecycle.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LifecycleApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(LifecycleApplication.class, args);

		System.out.println("main method is excuting");

		Student student = app.getBean(Student.class);

		student.setName("subha");
		student.setRoll(100);

		app.close();
		System.out.println(student.getName() + " " + student.getRoll());

		System.out.println("main method is ending");
	}

}
