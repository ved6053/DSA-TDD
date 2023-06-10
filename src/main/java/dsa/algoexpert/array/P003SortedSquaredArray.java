package dsa.algoexpert.array;

public class P003SortedSquaredArray {
public int[] sortedSquaredArray(int[] array) {
	int[] res = new int[array.length];
	int left=0, right=array.length-1;
	int end=array.length-1;
	while(left<=right){
		int leftValue=array[left]*array[left];
		int rightValue=array[right]*array[right];
		if(leftValue>rightValue){
			res[end--]=leftValue;
			left++;
		} else{
			res[end--]=rightValue;
			right--;
		}
	}
	return res;
}
}
