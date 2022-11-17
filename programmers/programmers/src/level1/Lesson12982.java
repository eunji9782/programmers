package level1;

import java.util.Arrays;

public class Lesson12982 {

	public static void main(String[] args) {
		int[] arr = {1,3,2,5,4};
		int budget = 9;
		int answer = new Solution().solution(arr, budget);
		System.out.println(answer);

	}
	
	//내가 푼 풀이 0.24ms
	static class Solution {
	    public int solution(int[] d, int budget) {
	        int answer = 0;

	        for(int i = 0; i < d.length-1; i++) {
	        	for(int j = i+1; j < d.length; j++) {
	        		if(d[i] > d[j]) {
	        			int temp = d[i];
	        			d[i] = d[j];
	        			d[j] = temp;
	        		}
	        	}
	        }
	       
	        int num = 0;

	        for(int i = 0; i < d.length; i++) {
	        	num += d[i];
	        	
	        	if(num <= budget) {
	        		answer++;
	        		continue;
	        	}else {
	        		break;
	        	}
	        }

	        return answer;
	    }
	}

}

//인기순 풀이
class Solution5 {
	  public int solution(int[] d, int budget) {
	      int answer = 0;

	        Arrays.sort(d); //정렬

	        for (int i = 0; i < d.length; i++) {
	            budget -= d[i];

	            if (budget < 0) break;

	            answer++;
	        }

	        return answer;
	  }
	}
