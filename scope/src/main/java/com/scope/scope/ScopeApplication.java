package com.scope.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScopeApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(ScopeApplication.class, args);

		// Student student1 = new Student();
		// Student student2 = new Student();
		// if (student1 == student2) {
		// System.out.println("same");
		// } else {
		// System.out.println("Not same");
		// }

		Student student1 = app.getBean(Student.class);
		Student student2 = app.getBean(Student.class);

		if (student1 == student2) {
			System.out.println("same");
		} else {
			System.out.println("Not same");
		}
	}

}
