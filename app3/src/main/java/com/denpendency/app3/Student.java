package com.denpendency.app3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int roll;
    private String name;
    // @Autowired
    private Address address;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public Student(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    // @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }
}
