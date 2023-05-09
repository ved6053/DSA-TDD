package dsa.leetcode.array;


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
    int diff=0;
    for(int num:arr){
      diff^=num;
    }
    diff&=-diff;
    for(int num:arr){
      if((diff&num)==0){
        res[0]^=num;
      } else {
        res[1]^=num;
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
