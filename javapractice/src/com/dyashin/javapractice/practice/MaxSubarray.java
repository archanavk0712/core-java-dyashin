package com.dyashin.javapractice.practice;

import java.util.Arrays;

public class MaxSubarray {

	public static int maxSum(int[] arr, int k) {

		if (arr.length < k) {
			return -1;
		}

		int currentSum = 0;
		for (int i = 0; i < k; i++) {
			currentSum += arr[i];
		}

		int maxSumVal = currentSum;

		for (int i = k; i < arr.length; i++) {
			currentSum = currentSum - arr[i - k] + arr[i];
			maxSumVal = Math.max(currentSum, maxSumVal);
		}

		return maxSumVal;
	}

	public static int[] maxSumArray(int[] arr, int k) {

		if (arr.length < k) {
			return new int[0];
		}

		int currentSum = 0;
		for (int i = 0; i < k; i++) {
			currentSum += arr[i];
		}

		int maxSumVal = currentSum;
		int startInd=0;

		for (int i = k; i < arr.length; i++) {
			currentSum = currentSum - arr[i - k] + arr[i];
			if(currentSum>maxSumVal) {
				maxSumVal=currentSum;
				startInd=i-k+1;
			}
		}

		int[] res=new int[k];
		for(int i=0;i<k;i++) {
			res[i]=arr[startInd+i];
		}
		
		return res;
	}

	public static void main(String[] args) {

//		int[] arr = { 1, 3, 5, 2, 4, 5, 2, 1 };
//		System.out.println(maxSum(arr, 3));
		
		int[] arr = { 1, 3, 5, 2, 4, 5, 2, 1 };
		System.out.println(Arrays.toString(maxSumArray(arr, 3)));
	}
}
