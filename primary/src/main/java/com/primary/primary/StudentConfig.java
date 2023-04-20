package com.primary.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class StudentConfig {

    @Bean
    public Student getStudent() {
        return new Student("sai", 100);
    }

    @Bean
    public Student getStudent1() {
        return new Student("subha", 101);
    }

    @Bean
    @Primary
    public Student getStudent2() {
        return new Student("suvendu", 102);
    }

}
