package dsa.leetcode.array;

/**
 * https://leetcode.com/problems/move-zeroes/
 * https://www.youtube.com/watch?v=oVDWH8IsGCU&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=10
 **/
public class MoveZeros {

	public int [] moveZeros(int[] nums){
		if(nums.length<2){
			return nums;
		}
		
		int zeroIndex=0, nonZeroIndex=1;
		while (zeroIndex<nums.length&&nonZeroIndex<nums.length){
			while(zeroIndex<nums.length&&nums[zeroIndex]!=0)
				zeroIndex++;
			while (nonZeroIndex<nums.length&&nums[nonZeroIndex]==0)
				nonZeroIndex++;
            if (zeroIndex <nonZeroIndex) {
                swap(nums, nonZeroIndex, zeroIndex);
	            zeroIndex++;
	            nonZeroIndex++;
			}
			
		}
		return nums;
	}
	
	private void swap(int[] nums, int n, int z){
		int temp = nums[n];
		nums[n] = nums[z];
		nums[z] = temp;
	}
}
