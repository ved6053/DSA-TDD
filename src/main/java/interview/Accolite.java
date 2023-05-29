package interview;

import java.util.HashMap;
import java.util.Map;

class Accolite {

	private static  int[] findTarget(int[] arr, int target) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		int[] dummy ={-1, -1};
		if(arr.length<2){
			return dummy;
		}
		int[] res = new int[2];
		for(int i=0;i<arr.length;i++){
			if(hashMap.containsKey(target-arr[i])){
				res[0] = target-arr[i];
				res[1] = arr[i];
				return res;
			}
			hashMap.put(arr[i], i);
		}
		return dummy;
	}
  public static void main(String[] args){
	  int[] arr ={2, 4, 1, 6, 7, 10,9, 13};
	  int target = 13;
	  int[] result = findTarget(arr, target);
	  System.out.println(result[0]+" "+result[1]);
  }

}