package com.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import java.util.Iterator;
import com.rest.model.Student;

@Component
public class StudentService {

	/* public static HashMap<Integer,Student> studentIdMap=getCountryIdMap(); */

	private static final List<Student> studentList = new ArrayList<Student>();

	public StudentService() {
		super();

		Student studentRajkot = new Student(1, "nilesh", "b.h.gardi");
		Student studentMorbi = new Student(4, "mayur", "darshan");
		Student studentJamnagar = new Student(3, "vishal", "atmiya");
		Student studentAhmdabad = new Student(2, "ajay", "vvp");

		studentList.add(studentRajkot);
		studentList.add(studentMorbi);
		studentList.add(studentAhmdabad);
		studentList.add(studentJamnagar);
	}

	public List<Student> getAllStudents() {

		return studentList;
	}

	public void deleteStudent(int id) {

		Iterator<Student> itr = studentList.iterator();

		while (itr.hasNext()) {
			Student value = itr.next();
			if (value.getId() == id) {
				itr.remove();
			}
		}

	}

	public Student getStudent(int id) {
		Student student = null;
		for (Student studentGetStudent : studentList) {
			if (studentGetStudent.getId() == id) {
				student = studentGetStudent;
			}
		}
		return student;
	}

	public Student addStudent(Student student) {
		student.setId(getMaxId() + 1);
		studentList.add(student);
		return student;
	}

	public Student updateStudent(Student student) {
		for (Student updateStudent : studentList) {
			if (updateStudent.equals(student)) {
				int index = studentList.indexOf(updateStudent);
				studentList.set(index, student);
			}
		}
		return student;
	}

	// Utility method to get max id
	public static int getMaxId() {
		int max = 0;
		for (Student student : studentList) {
			if (max <= student.getId())
				max = student.getId();
		}
		return max;
	}

}
