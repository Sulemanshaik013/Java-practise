package com.hypothesis.arrays;

public class PeakElement {

	public static void main(String[] args) {
		int [] nums= {1,2,3,1};
		System.out.println(peakElement(nums));
	}

	private static int peakElement(int[] nums) {
		int n=nums.length;
		if(n==1) {
			return nums[0];
		}
		if(nums[0]>=nums[1]) {
			return nums[0];
		}
		if(nums[n-1]>=nums[n-2]) {
			return nums[n-1];
		}
		for(int i=1;i<=n;i++) {
			if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) {
				return nums[i];
			}
		}
		return 0;
	}

}
