package com.neoteric.student.service;

public class StudentMap {
    String name;

    int rollNo;

    public StudentMap(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}
