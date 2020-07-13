package com.company;

import com.company.model.*;

import java.util.*;
import java.util.stream.Collectors;
 
public class Main {


    public static void main(String[] args) {
        Student s1 = new Student("nilesh", "b.h.gardi");
        Student s2 = new Student("vishal", "vvp");
        Student s3 = new Student("vishal", "b.h.gardi");
        Student s4 = new Student("mayur", "darshan");
        Student s5 = new Student("mayur", "darshan");
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);


        int count=1;
            Map<String , Integer>  studentMap= new HashMap<>();


                  for(int i=0;i<studentList.size() ;i++ ) {
                      if(studentMap.containsKey(studentList.get(i).getCollegeName()) ) {
                          count++;
                          studentMap.replace((studentList.get(i).getCollegeName()),count);
                      }
                      else
                      {
                          System.out.print(studentMap.containsValue(studentList.get(i).getCollegeName()));
                          studentMap.put(studentList.get(i).getCollegeName(), count);
                      }
                      count = 1;
                  }
        System.out.print(studentMap);
//        studentList = (ArrayList) studentList.stream().distinct().collect(Collectors.toList());
//        System.out.println(studentList);
      /*  Set<Student> st = new HashSet<Student>(studentList);
        for (Student student : st){
            System.out.println(student.getCollegeName() + ": " + Collections.frequency(studentList, student.getCollegeName()));
    }*/
       /* Map<String, Integer> studentMap = new HashMap<String, Integer>();
        String uniqName = studentList.get(0).getCollegeName();
        collegeCount.add(studentList.get(0).getCollegeName());

        for (int i = 1; i < studentList.size(); i++) {
            int count = 1;
            // System.out.print(studentList.get(0).getCollegeName());
            if (uniqName == studentList.get(i).getCollegeName()) {
                System.out.print("if---");
             }
            else
            {
                collegeCount.add(studentList.get(i).getCollegeName());
                uniqName= studentList.get(i).getCollegeName();

                System.out.print("eles---");
            }

        }
      System.out.print(collegeCount);
*/
    }}


