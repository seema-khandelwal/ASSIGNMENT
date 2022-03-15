package com.te.javabasic.pattern;

import java.util.Scanner;

public class Assigenment3 {
	public static void main(String[] args) {
		/*
		 * Scanner scanner=new Scanner(System.in);
		 * System.out.println("Enter the numbers of rows "); int rows=scanner.nextInt();
		 */

		int rows = 4;
		for (int i = 1; i <= rows; i++) {
			int k = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k = k + rows - j;
			}
			System.out.println();
		}
	}
}
