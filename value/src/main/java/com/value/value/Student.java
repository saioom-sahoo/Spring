package com.value.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Student {
    @Value("subha")
    private String name;
    @Value("100")
    private int roll;

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

}
