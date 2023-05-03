package dsa.leetcode.dp;


/**
 *https://leetcode.com/problems/decode-ways/
 */
public class DecodeWays {
	private final Algo algo;
	public 	DecodeWays(Algo algo){
		this.algo = algo;
	}
    private int decodeWaysRecursiveSolution(int[] arr, int i){
		if(arr[0]==0){
			return 0;
		}
		
		if(i<=0){
			return 1;
		}
		if(arr[i]==0||arr[i-1]*10+arr[i]>26){
			return decodeWaysRecursiveSolution(arr, i-1);
		}
		return decodeWaysRecursiveSolution(arr, i-1)+decodeWaysRecursiveSolution(arr, i-2);
    }
	private int decodeWaysDP(int[] arr) {
		int  len = arr.length;
		if (len <= 0 || arr[0] == 0) {
            return 0;
		}
		
		int[] res = new int[len+1];
		res[0] = 1;
		res[1] = 1;
		for(int i=1;i<len;i++){
	      if (arr[i] == 0 || arr[i - 1] * 10 + arr[i] > 26) {
	        res[i + 1] = res[i];
		  } else {
			res[i+1] = res[i-1]+res[i];
	      }
		}
		return res[len];
	}

	public int  decodeWays(String arr) {
		int[] nums = new int[arr.length()];
		int i=0;
		for(int e:arr.toCharArray()){
			nums[i++] = e-'0';
		}
		switch (algo){
			case REC:
        return decodeWaysRecursiveSolution(nums, arr.length() - 1);
			case DP:
				return decodeWaysDP(nums);
			default:
				return -1;
		}
	}
	
}
