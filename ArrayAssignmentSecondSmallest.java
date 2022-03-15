package com.te.javabasic.array;

public class ArrayAssignmentSecondSmallest {
	public static void main(String[] args) {
		int arr[] = { 33, 67, 98, 86, 22, 77,9 };
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] >arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			/*
			 * if(i==1) { break; }//to stop sorting
			 */
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}

		System.out.println("second smallest number is " + arr[1]);
	}
}
