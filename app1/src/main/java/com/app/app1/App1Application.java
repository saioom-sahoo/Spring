package com.app.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App1Application {

	public static void main(String[] args) {
		var app = SpringApplication.run(App1Application.class, args);

		Student student = app.getBean(Student.class);
		student.setName("subham");
		System.out.println(student.getName());

		// Student student = new Student();
		// student.setName("subha");
		// student.setRoll(100);

		// System.out.println(student.getName() + " " + student.getRoll());

	}

}
