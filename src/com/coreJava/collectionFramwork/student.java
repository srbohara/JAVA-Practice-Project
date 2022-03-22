package com.coreJava.collectionFramwork;

public class student {
    private String name;
    private String address;
    private  int age;
    private String  faculty;


    public student(String name, String address, int age, String faculty) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.faculty=faculty;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
