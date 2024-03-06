package MountB;

import java.util.ArrayList;

public class Q_3 {// Breaking the records 

	public static void main(String[] args) {
		int n = 10;
		int[] scores = {3,4,21,36,10,28,35,5,24,42};
		
		int minscore = scores[0];
		int maxscore = scores[0];
		int minc = 0;
		int maxc = 0;
		
		for(int i = 0; i < n; i++) {
			int score = scores.length;
			
			if(score < minscore) {
				minscore = score;
				minc++;
			}else if(score > maxscore) {
				maxscore = score;
				maxc++;
			}
		}
		ArrayList<Integer> a = new ArrayList<>();
		a.add(maxc);
		a.add(minc);
		
		System.out.println(a);
	}

}
