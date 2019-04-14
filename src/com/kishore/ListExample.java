package com.kishore;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
	 List<Student> students = new ArrayList<>();
	 students.add(new Student("kishore", 1));
	 students.add(new Student("reddy", 2));
	 System.out.println(students);
	}

}
