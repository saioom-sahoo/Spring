package com.logger.logger;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class LoggerApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(LoggerApplication.class, args);
		Student bean = app.getBean(Student.class);
		bean.setName("subha");
		bean.setRoll(101);
		log.info("student name " + bean.getName());
		log.info("student roll " + bean.getRoll());
	}

}
