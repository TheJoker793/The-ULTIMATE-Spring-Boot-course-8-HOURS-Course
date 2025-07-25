package com.channoufi.firstRest;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String firstname;
    private String lastname;
    @Column(unique = true)
    private String email;
    private int age;
    @OneToOne(mappedBy = "student",cascade=CascadeType.ALL)
    private StudentProfile profile;
    @ManyToOne
    @JoinColumn(name = "schoolId")

    private School school;

    public Student() {
    }

    public StudentProfile getProfile() {
        return profile;
    }

    public void setProfile(StudentProfile profile) {
        this.profile = profile;
    }

    public Student(String firstname, String lastname, String email, int age, StudentProfile profile) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.profile = profile;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
