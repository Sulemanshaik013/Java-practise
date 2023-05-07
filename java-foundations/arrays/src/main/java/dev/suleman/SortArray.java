package com.hypothesis.arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int[] integerArray = new int[] { 12, 4, 67, 8, 56, 60, 3 };
		int max = 0;
		for (int i = 0; i < integerArray.length; i++) {
			for (int j = i + 1; j < integerArray.length; j++) {
				if (integerArray[i] > integerArray[j]) {
					max = integerArray[i];
					integerArray[i] = integerArray[j];
					integerArray[j] = max;
				}
			}
		}
		//using in built method
		//Arrays.sort(integerArray); 
		for (int i = 0; i < integerArray.length; i++) {
			System.out.print(integerArray[i] + " ");
		}

	}

}