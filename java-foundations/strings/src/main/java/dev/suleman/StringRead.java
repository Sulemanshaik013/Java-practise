package com.hypothesis.strings;

import java.util.Scanner;

public class StringRead {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int stringArrayLength = sc.nextInt();
		int pos = -1;
		String[] stringArray = new String[stringArrayLength];
		System.out.println("Enter elements ");
		while (++pos < stringArrayLength) {
			stringArray[pos] = sc.nextLine();
			sc.nextLine();

		}
//		for (int i = 0; i < stringArrayLength; i++) {
//			stringArray[i] = sc.nextLine();
//		}
		printStringArray(stringArray);
		sc.close();
	}

	private static void printStringArray(String[] stringArray) {
		System.out.print("\nthe elements in String Array is:\t{");
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]);
		}
		System.out.println("}");
	}

}
