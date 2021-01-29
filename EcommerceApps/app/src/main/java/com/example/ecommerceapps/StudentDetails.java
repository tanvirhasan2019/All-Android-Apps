package com.example.ecommerceapps;

public class StudentDetails {


    private String id;
    private String name;

    public StudentDetails() {
        // This is default constructor.
    }

    public String getStudentName() {

        return name;
    }

    public void setStudentName(String name) {

        this.name = name;
    }

    public String getStudentId() {

        return id;
    }

    public void setStudentId(String id) {

        this.id = id;
    }

}