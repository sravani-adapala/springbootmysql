package com.neoteric.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity(name="student")

public class StudentEntity implements Serializable {
    @Id
    private int sno;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "mobileno")
    private String mobileno;
    public StudentEntity() {

    }


    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }
}
