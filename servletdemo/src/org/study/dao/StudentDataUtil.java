package org.study.dao;

import java.util.ArrayList;
import java.util.List;

import org.study.model.Student;

public class StudentDataUtil {

	public static List<Student> getStudents() {
		
		// create an empty list
		List<Student> students = new ArrayList<>();
		
		// add sample data
		students.add(new Student("Mary", "Public", "mary@gmail.com"));
		students.add(new Student("John", "Doe", "john@yahoo.com"));
		students.add(new Student("Ajay", "Rao", "ajay@msn.com"));
		
		// return the list
		return students;
	}
}







