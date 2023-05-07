package com.hypothesis.arrays;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		int[] nums = { 4, 2, 2, 8, 7, 5, 3 };
		int n = nums.length;

		System.out.println("Maximum Element is : " + maxElement(nums, n));
		System.out.println("Minimum Element is : " + minElement(nums, n));
	}

	private static int minElement(int[] nums, int n) {
		int min = nums[0];
		for (int i = 0; i < n; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
		}

		return min;
	}

	private static int maxElement(int[] nums, int n) {
		int max = nums[0];
		for (int i = 0; i < n; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}

		return max;
	}

}
