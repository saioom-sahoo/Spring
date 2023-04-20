package com.qulifier.qulifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QulifierApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("student")
	private Person person;

	public static void main(String[] args) {
		SpringApplication.run(QulifierApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		person.work();
	}

}
