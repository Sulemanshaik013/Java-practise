package com.arrays;

import java.util.Scanner;

public class DeclarationAndIntialization {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// int array
		int[] integerArray;
		System.out.println("Enter the length of Integer Array");
		int integerArrayLength = sc.nextInt();
		integerArray = new int[integerArrayLength];
		// String array
		String[] stringArray;
		System.out.println("Enter the length of String Array");
		int stringArrayLength = sc.nextInt();
		stringArray = new String[stringArrayLength];
		// double array
		double[] doubleArray;
		System.out.println("Enter the length of double Array");
		int doubleArrayLength = sc.nextInt();
		doubleArray = new double[doubleArrayLength];

		for (int i = 0; i < integerArrayLength; i++) {
			System.out.println("Enter value of " + i + "th index in Integer Array ");
			integerArray[i] = sc.nextInt();

		}
		
		for (int i = 0; i < doubleArrayLength; i++) {
			System.out.println("Enter value of " + i + "th index in Double Array ");
			doubleArray[i] = sc.nextDouble();
		}
		
		sc.nextLine();
		for (int i = 0; i < stringArrayLength; i++) {
			System.out.println("Enter value of " + i + "th index in String Array ");
			stringArray[i] = sc.nextLine();
		}
		sc.close();

		printIntegerArray(integerArray);

		printDoubleArray(doubleArray);

		printStringArray(stringArray);
	}

	private static void printStringArray(String[] stringArray) {
		System.out.print("\nthe elements in String Array is:\t{");
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i] + " ");
		}
		System.out.println("}");
	}

	private static void printIntegerArray(int[] integerArray) {
		System.out.print("the elements in integer Array is:\t{");
		for (int i = 0; i < integerArray.length; i++) {
			System.out.print(integerArray[i] + " ");
		}
		System.out.println("}");
	}

	private static void printDoubleArray(double[] doubleArray) {
		System.out.print("\nthe elements in double Array is: \t{");
		for (int i = 0; i < doubleArray.length; i++) {
			System.out.print(doubleArray[i] + " ");
		}
		System.out.println("}");
	}

}