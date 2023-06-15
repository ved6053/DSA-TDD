package dsa.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.youtube.com/watch?v=VM5Mh3-UFPg&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=19
 * https://leetcode.com/problems/contiguous-array/
 */
public class ContiguousArray {
	public int findMaxLength(int[] nums) {
		int zeros=0;
		Map<Integer, Integer> map=new HashMap<>();
		int result=0;
		map.put(zeros, -1);
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0){
				zeros++;
			} else{
				zeros--;
			}
			if(map.containsKey(zeros)){
				result=Math.max(result, i-map.get(zeros));
			} else {
				map.put(zeros, i);
			}
		}
		return result;
	}
}
