package com.neoteric.student.service;

public class Student {
    String Country;
    String name;

    public Student(String country, String name) {
        Country = country;
        this.name = name;
    }

    public String getCountry() {

        return Country;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Country='" + Country + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}



