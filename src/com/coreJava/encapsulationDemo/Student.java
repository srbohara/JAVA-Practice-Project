package com.coreJava.encapsulationDemo;

public class Student {
    private int id;
    private String name;
    private int rollNo;
    private String address;
    private String faculty;

    public Student(int id, String name, int rollNo, String address, String faculty) {
        this.id = id;
        this.address = address;
        this.faculty = faculty;
        this.rollNo = rollNo;
        this.name = name;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}