package com.example.studentappnew_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name ="students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String admno;
    private int rollno;
    private String college;

    public Students() {
    }

    public Students(int id, String name, String admno, int rollno, String college) {
        this.id = id;
        this.name = name;
        this.admno = admno;
        this.rollno = rollno;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdmno() {
        return admno;
    }

    public int getRollno() {
        return rollno;
    }

    public String getCollege() {
        return college;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdmno(String admno) {
        this.admno = admno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
