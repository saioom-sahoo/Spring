package com.expresslanguage.expresslanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("${Student.name}")
    private String name;
    @Value("${Student.roll}")
    private int roll;
    @Value("#{${Student.fee}+200}")
    private double fee;

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    public int getRoll() {
        return roll;
    }
}
