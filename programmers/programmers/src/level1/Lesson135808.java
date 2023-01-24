package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lesson135808 {

	public static void main(String[] args) {
		int k = 3;
		int m = 4;
		int[] score = {1, 2, 3, 1, 2, 3, 1};
		
		int answer = new Solution135808().solution(k, m, score);
		
		System.out.println(answer);

	}

}

//295.83ms (너무 길다...)
class Solution135808 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int temp = 0;
        
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        ArrayList<Integer> scoreArr = new ArrayList<Integer>();
        
        for(int i = 0; i < score.length; i++) {
        	scoreArr.add(score[i]);
        }
        
        Collections.sort(scoreArr, Collections.reverseOrder());
        
        temp = scoreArr.size() - (scoreArr.size() % m);
        		
        for(int i = 0; i < temp;) {
        	for(int j = 0; j < m; j++) {
        		tempArr.add(scoreArr.get(i));
        		i++;
        	}
        	
        	answer += Collections.min(tempArr) * m;
        	System.out.println(tempArr);
        	tempArr = new ArrayList<Integer>();
        }
        
        return answer;
    }
}

class SolutionA135808 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }
}