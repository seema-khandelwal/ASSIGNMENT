package com.te.javabasic.collection;

public class Student  {
	int student_id;
	String student_name;
	int student_age;
	int student_marks;

	public Student(int student_id, String student_name, int student_age, int student_marks) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_age = student_age;
		this.student_marks = student_marks;
	}

	@Override
	public String toString() {
		return "id: " + student_id + ", name: " + student_name + ", age: " + student_age
				+ ", marks: " + student_marks ;
	}
}
