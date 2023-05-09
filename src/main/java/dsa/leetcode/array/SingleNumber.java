package dsa.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

  public int findOddWithTwoRepeat(int[] arr) {
    int res = 0;
    for (int item : arr) {
      res ^= item;
    }
    return res;
  }
  public int[] findTwoOddWithTwoRepeat(int[] arr) {
    int[] res = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for(int num:arr){
      map.put(num, map.getOrDefault(num, 0)+1);
    }
    int i=0;
    for(Map.Entry<Integer, Integer> entry:map.entrySet()){
      if(entry.getValue()==1){
        res[i++] = entry.getKey();
      }
    }
    return res;
  }

  public int findOddWithThreeRepeat(int[] arr) {
    int ones=0, twice=0, thrice=0;
   for(int num:arr) {
     twice|=(ones&num);
     ones^=num;
     thrice&=ones;
     ones&=(~thrice);
     twice&=(~thrice);
   }
   return ones;
  }
}
