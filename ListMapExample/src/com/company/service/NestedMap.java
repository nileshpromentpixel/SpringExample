package com.company.service;

import com.company.model.Student;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NestedMap {

    public Map<String, Map<String, Integer>> getCollegeData(List<Student> studentList) {

        Map<String, Map<String, Integer>> collegeMap = new HashMap<>();
        int count = 1;
        for (Student student : studentList) {
            if (collegeMap.containsKey(student.getCollegeName())) {
                Map<String, Integer> gradeMap = collegeMap.get(student.getCollegeName());

                if (gradeMap.containsKey(student.getGrade())) {
                    gradeMap.replace(student.getGrade(), count = count + 1);
                    collegeMap.replace(student.getCollegeName(), gradeMap);
                } else {
                    gradeMap.put(student.getGrade(), 1);
                    collegeMap.replace(student.getCollegeName(), gradeMap);
                }

            } else {
                Map<String, Integer> gradeMap = new HashMap<>();
                if (student.getGrade() == "A") {
                    gradeMap.put("A", 1);
                    gradeMap.put("B", 0);
                    gradeMap.put("C", 0);

                } else if (student.getGrade() == "B") {
                    gradeMap.put("A", 0);
                    gradeMap.put("B", 1);
                    gradeMap.put("C", 0);


                } else {
                    gradeMap.put("A", 0);
                    gradeMap.put("B", 0);
                    gradeMap.put("C", 1);
                }

                collegeMap.put(student.getCollegeName(), gradeMap);
            }
        }

        return collegeMap;
    }
}
