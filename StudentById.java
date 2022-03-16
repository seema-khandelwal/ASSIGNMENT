package com.te.javabasic.collection;

import java.util.Comparator;

public class StudentById implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.student_id-o2.student_id;
	}

}
