package com.xml.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("app.xml")
@SpringBootApplication
public class XmlApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(XmlApplication.class, args);
		Student student = app.getBean(Student.class);
		System.out.println(student.getName() + " " + student.getRoll());
	}

}
