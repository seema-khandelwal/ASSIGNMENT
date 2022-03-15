package com.te.javabasic.array;

import java.util.Scanner;

public class ArrayAssignment2Smallest {
	public static void main(String[] args) {
		int arr[] = { 10, 30, 40, 20, 97, 80 };
		int smallest = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.println("smallest number is: " + smallest);
	}
}
