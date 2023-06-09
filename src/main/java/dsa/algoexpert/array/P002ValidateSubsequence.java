package dsa.algoexpert.array;

import java.util.List;

/**
 * https://www.algoexpert.io/questions/validate-subsequence
 **/
public class P002ValidateSubsequence {

	public  boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int  sequenceIndex=0;
		for(int arrayIndex=0;arrayIndex<array.size();arrayIndex++){
			if(array.get(arrayIndex)==sequence.get(sequenceIndex)){
				sequenceIndex++;
			}
			
			if(sequenceIndex==sequence.size()){
				break;
			}
		}
		return sequenceIndex==sequence.size();
	}
}
