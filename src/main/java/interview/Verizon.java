package interview;

import java.util.HashMap;
import java.util.Map;

public class Verizon {
	public static void main(String[] args){
		String sentence = "Hello I am Here to Say Hello I am good Hello Bye";
		Map<String , Integer> map = new HashMap<>();
		for(String word:sentence.split(" ")){
			if(word.trim().equals("")){
				continue;
			}
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		int maxLength = 0;
		String maxLengthWord = "";
		System.out.println("Word : Count");
		for(Map.Entry<String, Integer> entry:map.entrySet()){
			String key=entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+": "+value);
			if(maxLength<value){
				maxLength =value;
				maxLengthWord = key;
			}
		}
		System.out.println("Word With Maximum Count:"+maxLengthWord+" its Count  is :"+maxLength);
	}
	

}
