package com.company.service;

import com.company.model.Student;

import java.util.*;

public class UniqMap {

    public Set<String> getStudentUniq(List<Student> studentList) {
        Map<String, Student> stringStudentMap = new TreeMap<>();

        for (Student student : studentList) {

            stringStudentMap.put(student.getStudentName(), student);
        }

        return stringStudentMap.keySet();
    }
}
