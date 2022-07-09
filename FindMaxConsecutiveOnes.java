package com.leetcode.arrays;

public class FindMaxConsecutiveOnes {
	public static void main(String[] args) {
		int nums[] = {1,0,0,1,1,1,0,1,1};
		int ans =FindMaxConsecutiveOnesSolution.findMaxConsecutiveOnes(nums);
		System.out.println(ans);
		
	}
}

class FindMaxConsecutiveOnesSolution {
	public static int findMaxConsecutiveOnes(int[] nums) {

		if (nums.length == 1) {
			if (nums[0] == 1) {
				return 1;
			}
			return 0;
		}

		int maxConsecutive = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			if (nums[i] == 1) {
				count = 1;
			}

			for (int k = i + 1; k < nums.length; k++) {
				if (nums[i] == nums[k] && nums[i] == 1) {
					count++;
				} else {
					break;
				}
			}
			if (maxConsecutive < count) {
				maxConsecutive = count;
			}

		}
		return maxConsecutive;
	}
}