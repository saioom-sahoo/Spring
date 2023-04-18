package com.lifecycle.lifecycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Student {
    private String name;
    private int roll;

    public Student() {
        System.out.println("Constructor is calling");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @PostConstruct
    public void init() {
        System.out.println("object intialized");
    }

    @PreDestroy
    public void destoryed() {
        System.out.println("object destroyed");
    }

}
