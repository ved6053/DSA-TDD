package dsa.leetcode.string;
/**
 * https://leetcode.ca/all/1427.html
 * https://www.youtube.com/watch?v=mU0Uin1vBGg&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=20
 * */
public class PerformStringShifts {
	private static final int LEFT=0;
	private static final int RIGHT=1;
	public String performStringShifts(String str, int[][] shifts){
		String result=str;
		int left=0, right=0;
		int n=str.length();
		for(int[] shift:shifts) {
			switch (shift[0]) {
				case LEFT:
					left+=shift[1];
					break;
				case RIGHT:
					right+=shift[1];
			}
		}
		left=left%n;
		right=right%n;
		int begin=left;
		int end=left+n;
		result=(result+result).substring(begin, end);
		end=2*n-right;
		begin=n-right;
		result=(result+result).substring(begin, end);
		return result;
	}
}
