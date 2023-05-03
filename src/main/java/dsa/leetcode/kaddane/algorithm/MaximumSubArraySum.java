package dsa.leetcode.kaddane.algorithm;

import java.security.InvalidAlgorithmParameterException;

public class MaximumSubArraySum {

	/*
	* kaddane's algoritms
	**/
	public int maxSubArraySum(int[] arr) throws InvalidAlgorithmParameterException{
		int size = arr.length;
		if(size<=0){
			throw new InvalidAlgorithmParameterException("Array must have at least one items");
		}
		int sum = arr[0];
		int maxSum = sum;
		for(int i=1;i<size;i++) {
			sum = Math.max(arr[i], arr[i]+sum);
			maxSum = Math.max(sum, maxSum);
		}
		return maxSum;
	}
}
