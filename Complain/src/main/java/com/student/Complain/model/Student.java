package com.student.Complain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    private String registrationNumber;

    private String name;

    private String email;

    private int studentYear;

    private String program;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }
    public int getStudentYear() {
        return studentYear;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public String getProgram() {
        return program;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
}

