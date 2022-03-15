package com.te.javabasic.array;

import java.util.Arrays;

public class ArrayAssignmentLargest {
	public static void main(String[] args) {
		int arr[] = { 10, 30, 40, 20, 97, 80 };
		int largest = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest number is: " + largest);
	}
}