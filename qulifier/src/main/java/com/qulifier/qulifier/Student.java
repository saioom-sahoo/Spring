package com.qulifier.qulifier;

import org.springframework.stereotype.Component;

@Component
public class Student implements Person {

    @Override
    public void work() {
        System.out.println("Student is Working");

    }

}
