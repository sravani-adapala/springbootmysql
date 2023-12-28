package com.neoteric.student.service;

import java.util.HashMap;

public class InHashMapService {

        public HashMap<Integer, String> getMapStudents() {
            StudentMap s1 = new StudentMap("sravs", 123);
            StudentMap s2 = new StudentMap("triveni", 345);
            HashMap<Integer, String> map = new HashMap<Integer, String>();
            addStudentToMap(map, s1);
            addStudentToMap(map, s2);

            return map;
        }

        public void addStudentToMap(HashMap<Integer, String> map, StudentMap student) {
            map.put(student.getRollNo(), student.getName());
        }

        public String getStudentNameByRollNo(int rollNo) {
            HashMap<Integer, String> studentMap = getMapStudents();
            return studentMap.get(rollNo);

        }
    }




