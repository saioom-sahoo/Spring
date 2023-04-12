package com.app1.app2;

import org.springframework.stereotype.Component;

@Component
public class Student implements StudentInterface {

    public Student() {
        System.out.println("Student object is created");
    }

    @Override
    public void study() {
        System.out.println("student is study");

    }
}
