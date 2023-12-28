package com.neoteric.student;

public class SchoolService {
    private static int teachercount = 30;

    // private static int SchoolService;
    public SchoolService() {
        System.out.println("From counting in School Teachers: " + teachercount);

    }

    public int getTeachercount() {
        return teachercount;

    }

    public int getadd() {
        return teachercount = teachercount + 1;
    }

    public int getremove() {
        return teachercount = teachercount - 1;
    }
}

