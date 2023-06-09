package interview;

public class Accolite2 {
  /**
   * Find missing number from an array of 10 natural numbers
   * eg - {1,2,3,4,5,6,8,9,10} - output should be 7
   */
    int findMissingNumber(int[] arr, int n){
		int res=n;
		for(int i=0;i<arr.length;i++){
			res^=(i+1)^arr[i];
		}
		return res;
    }
  void arrangeArr(int[] arr){
	  int[] temp = new int[3];
	  for(int e:arr){
		  temp[e]++;
	  }
	  int k=0;
	  for(int i=0;i<=2;i++){
		  int count=temp[i];
		  for(int l=0;l<count;l++){
			  arr[k++]=i;
		  }
	  }
  }
}
