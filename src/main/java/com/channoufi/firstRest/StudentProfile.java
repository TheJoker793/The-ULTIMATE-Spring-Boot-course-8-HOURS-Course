package com.channoufi.firstRest;

import jakarta.persistence.*;

@Entity
public class StudentProfile {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String bio;
    @OneToOne
    @JoinColumn(name = "studentId")
    private Student student;


    public StudentProfile() {
    }
    public StudentProfile(String bio,Student student) {
        this.bio = bio;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
