package com.leetcode.arrays;

public class ValidMouinatinArray {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 7, 5, 4, 3 };

		System.out.println(validMountainArray(arr));
	}

	public static boolean validMountainArray(int[] arr) {

		if (arr.length < 3)
			return false;

		int i = 0;
		for (; i < arr.length - 1; i++) { // [0,1,2,3,4,5,6,7,8,9] [1,3,2]
			if (arr[i] > arr[i + 1]) {
				i++;
				break;
			}
			if (arr[i] == arr[i + 1]) {
				return false;
			}

		}

		if (i < 2)
			return false;
		for (; i < arr.length; i++) {

			if (arr[i - 1] <= arr[i]) {
				return false;
			}

		}

		return true;

	}
}
