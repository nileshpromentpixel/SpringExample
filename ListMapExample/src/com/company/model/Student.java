package com.company.model;

public class Student {
    private String studentName ;
    private String collegeName;

    public Student(String studentName, String collegeName) {
        this.studentName = studentName;
        this.collegeName = collegeName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
