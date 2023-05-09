package dsa.leetcode.array;

public class SingleNumber {

  public int findOddWithTwoRepeat(int[] arr) {
    int res = 0;
    for (int item : arr) {
      res ^= item;
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
