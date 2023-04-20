package com.qulifier.qulifier;

import org.springframework.stereotype.Component;

@Component
public class Employee implements Person {

    @Override
    public void work() {
        System.out.println("Employee is Working");
    }

}
