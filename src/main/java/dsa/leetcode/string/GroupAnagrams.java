package dsa.leetcode.string;

import java.util.*;

/**
 * https://leetcode.com/problems/group-anagrams/
 * https://www.youtube.com/watch?v=ywRjEfkNsVc&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=11
 **/
public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String,List<String>> hashMap = new HashMap<>();
		List<List<String>> result = new ArrayList<>();
		for(String str:strs){
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);
			List<String> anagramlist = hashMap.getOrDefault(sorted, new ArrayList<>());
			anagramlist.add(str);
			hashMap.put(sorted, anagramlist);
		}
		
		for (Map.Entry<String, List<String>> entry: hashMap.entrySet()){
			result.add(entry.getValue());
		}
		return result;
	}
}
