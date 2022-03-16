package com.te.javabasic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentTest {
	static ArrayList<Student> arrayList = new ArrayList<Student>();

	public static void sortingFunction() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number for data\npress 1 for id\npress 2 for name\npress 3 for age\npress 4 for marks");
		int number = scanner.nextInt();
		switch (number) {
		case 1:
			System.out.println("----Sort by id ----");
			Collections.sort(arrayList, new StudentById());
			break;
		case 2:
			System.out.println("--sort by name ----");
			Collections.sort(arrayList, new StudentByName());
			break;
		case 3:
			System.out.println("--sort by age ----");
			Collections.sort(arrayList, new StudentByAge());
			break;

		case 4:
			System.out.println("--sort by marks ----");
			Collections.sort(arrayList, new StudentByMarks());
			break;
		}
		for (Student student : arrayList) {
			System.out.println(student);
		}
		System.out.println("Do you want to continue sorting?(y/n)");
		String y="y";
		if(scanner.next().equals(y)) {
			sortingFunction();
		}else {
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		arrayList.add(new Student(1, "siya", 23, 77));
		arrayList.add(new Student(5, "aliya", 25, 99));
		arrayList.add(new Student(4, "tanu", 21, 88));
		arrayList.add(new Student(2, "mrunalini", 22, 87));
		arrayList.add(new Student(3, "rashmi", 24, 66));
		System.out.println(arrayList);
		sortingFunction();
	}

}
