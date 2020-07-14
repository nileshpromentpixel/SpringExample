package com.company;

import com.company.model.*;
import com.company.service.IntegerMap;
import com.company.service.MapwithList;
import com.company.service.NestedMap;
import com.company.service.UniqMap;

import java.util.*;
import java.util.stream.Collectors;
 
public class Main {


    public static void main(String[] args) {
        Student s1 = new Student("w", "b.h.gardi", "A");
        Student s2 = new Student("abhi", "b.h.gardi", "B");
        Student s3 = new Student("vishal", "b.h.gardi", "A");
        Student s4 = new Student("mayur", "darshan", "C");
        Student s5 = new Student("aditya", "abc", "B");
        Student s6 = new Student("aditya", "abc", "B");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);

        NestedMap nestedMap = new NestedMap();
        System.out.println();
        System.out.print(nestedMap.getCollegeData(studentList));


        UniqMap uniqMap = new UniqMap();
        System.out.println();
        System.out.print("uniq name of student" + uniqMap.getStudentUniq(studentList));

        MapwithList mapwithList = new MapwithList();
        System.out.println();
        System.out.print("ShortedMap of Student" + mapwithList.getCollegeData(studentList));

        IntegerMap integerMap = new IntegerMap();
        System.out.println();
        System.out.println("College wise Student  Count" + integerMap.getCount(studentList));


    }          // System.out.print(mapwithList.getCollegeData(studentList));

}



