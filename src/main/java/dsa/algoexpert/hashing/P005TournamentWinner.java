package dsa.algoexpert.hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P005TournamentWinner {
	public String tournamentWinner(
			List<List<String>> competitions, List<Integer> results) {
		int highestScore=0;
		String winner="";
		Map<String, Integer> hashMap = new HashMap<>();
		for(int i=0;i<competitions.size();i++){
			String gameWinner=competitions.get(i).get(results.get(i)==0?1:0);
			int score=hashMap.getOrDefault(gameWinner, 0)+3;
			hashMap.put(gameWinner, score);
			if(score>highestScore){
				highestScore=score;
				winner=gameWinner;
			}
		}
		return winner;
	}
}
