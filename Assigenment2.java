package com.te.javabasic.pattern;

public class Assigenment2 {
	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {
			int alphabet = 65;
			for (int j = i; j >= 0; j--) {
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}
	}
}
