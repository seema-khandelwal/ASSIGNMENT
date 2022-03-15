package com.te.javabasic.array;

import java.util.Arrays;

public class ArrayAssignmentDupicate {
	public static void main(String[] args) {
		int arr[] = { 22, 44, 56, 44, 88, 100, 200, 100,200,200,100};
		System.out.println(Arrays.toString(arr));
		System.out.println("Duplicate values :");
		for (int j = 0; j < arr.length; j++) {
			int count=0;
			for (int i = 0; i < arr.length; i++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					count++;
					arr[i]='\n';	
				}
			}
			if(arr[j]!='\n' && count>0) {
				System.out.println(arr[j] + "");	
		}
	}
}
}