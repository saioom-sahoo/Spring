package com.scope.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StudentConfig {
    @Bean
    @Scope("prototype")
    public Student getStudent() {
        return new Student();
    }
}
