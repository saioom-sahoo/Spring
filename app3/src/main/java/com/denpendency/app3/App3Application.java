package com.denpendency.app3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App3Application {

	public static void main(String[] args) {

		var app = SpringApplication.run(App3Application.class, args);
		Student student = app.getBean(Student.class);

		student.setName("subha");
		student.setRoll(100);
		System.out.println(student.getName() + " " + student.getRoll());
		student.getAddress().setCity("bbsr");
		student.getAddress().setState("odisha");

		System.out.println(student.getAddress().getCity() + " " + student.getAddress().getState());

	}

}
