package com.neoteric.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class InMemory {
    static Predicate<Student> CountryPredicate=(student) -> student.getCountry().equalsIgnoreCase("india");

    public List<Student>getCurrentStudent(){

        List<Student> names=new ArrayList<Student>();
        Student s=new Student("India","sravs");
        Student s1=new Student("India","chinnu");
        Student s2=new Student("Aus","appu");
        names.add(s);
        names.add(s1);
        names.add(s2);
        List<Student> streamsamecountryStudents=names.stream()
                .filter(name->CountryPredicate.test(name))
                .collect(Collectors.toList());
        System.out.println(" streamsamecountryStudents" +streamsamecountryStudents);
        return streamsamecountryStudents;

    }


}
