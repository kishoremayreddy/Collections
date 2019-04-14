package com.kishore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
	}
}


public class ListExample {

	public static void main(String[] args) {
	 List<Student> students = new ArrayList<>();
	 students.add(new Student("kishore",1));
	 students.add(new Student("reddy",2));
	 students.add(new Student("sai",3));
	
	 Collections.sort(students);
	 System.out.println(students);
	 Collections.sort(students, new AscendingStudentComparator());
	 System.out.println(students);
	}

}
