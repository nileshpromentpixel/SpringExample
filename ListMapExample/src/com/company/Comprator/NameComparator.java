package com.company.Comprator;

import com.company.model.Student;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return s1.getStudentName().compareTo(s2.getStudentName());
    }


}
