package com.app1.app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App2Application {

	public static void main(String[] args) {
		var app = SpringApplication.run(App2Application.class, args);
		StudentInterface studentInterface = app.getBean(StudentInterface.class);

		studentInterface.study();

	}

}
