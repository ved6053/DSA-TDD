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
     twice = twice|(ones&num);
     ones=ones^num;
     thrice = ones&twice;
     ones = ones&(~thrice);
     twice = twice&(~thrice);
   }
   return ones;
  }
}
