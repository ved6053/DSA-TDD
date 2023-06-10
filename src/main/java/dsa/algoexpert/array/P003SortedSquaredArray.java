package dsa.algoexpert.array;

public class P003SortedSquaredArray {
public int[] sortedSquaredArray(int[] array) {
	int[] res = new int[array.length];
	int mergePoint=-1;
	for(int i=0;i<array.length;i++){
		if(array[i]<0){
			mergePoint++;
		} else{
			break;
		}
	}
	
	int left=mergePoint, right=mergePoint+1;
	int index=0;
	while(left>=0&&right<array.length) {
		int leftValue=array[left]*array[left];
		int rightValue=array[right]*array[right];
		if(leftValue==rightValue){
			res[index++]=leftValue;
			res[index++]=rightValue;
			left--;
			right++;
		} else if(leftValue<rightValue){
			res[index++]=leftValue;
			left--;
		} else if(leftValue>rightValue){
			res[index++]=rightValue;
			right++;
		}
	}
	while(left>=0){
		res[index++]=array[left]*array[left];
		left--;
	}
	while(right<array.length){
		res[index++]=array[right]*array[right];
		right++;
	}
	
	return res;
}
}
