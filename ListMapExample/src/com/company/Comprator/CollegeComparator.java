package com.company.Comprator;

import com.company.model.Student;

import java.util.Comparator;

public class CollegeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return s1.getCollegeName().compareTo(s2.getCollegeName());
    }
}
