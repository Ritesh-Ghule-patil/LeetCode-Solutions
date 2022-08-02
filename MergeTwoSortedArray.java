package com.leetcode.arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int nums1[] = { 1,2,3,0,0,0};
		int[] nums2 = {4,5,6};
		
		MergeTwoSortedArraySolution.merge(nums1,3, nums2, nums2.length);
		
		System.out.println(Arrays.toString(nums1));
	}
}

class MergeTwoSortedArraySolution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int ind = m+n-1;
        m--;
        n--;
        while(m>=0 && n>=0){
            if(nums1[m]>nums2[n]){
                nums1[ind] = nums1[m];
                ind--;
                m--;
            }
            else{
                nums1[ind] = nums2[n];
                ind--;
                n--;
            }
                
        }
        while(n>=0){
            nums1[ind] = nums2[n];
            ind--;
            n--;
        }
        
    }
}
