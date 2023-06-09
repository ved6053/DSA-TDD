package dsa.algoexpert.array;

import java.util.List;

/**
 * https://www.algoexpert.io/questions/validate-subsequence
 **/
public class P002ValidateSubsequence {

	public  boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int i=0, j=0;
		while(i<array.size()&&j<sequence.size()){
			int nextElement = sequence.get(j);
			while(i<array.size()&&array.get(i)!=nextElement)
				i++;
			if(i<array.size()&&array.get(i)==nextElement){
				i++;
				j++;
			}
			
		}
		return j==sequence.size();
	}
}
