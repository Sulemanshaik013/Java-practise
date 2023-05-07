package com.hypothesis.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] nums = { 3, 6, 2, 1, 7, 4 };
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		reverse(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

	private static void reverse(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			swap(nums, start, end);
			start++;
			end--;
		}
	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
