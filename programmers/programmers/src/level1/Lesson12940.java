package level1;

import java.util.Arrays;

public class Lesson12940 {

	public static void main(String[] args) {
		int[] arr = new Solution().solution(3, 12);
		System.out.println(Arrays.toString(arr));
	}
	
	//내가 푼 풀이 (최소공배수는 공식 참조함) 0.07ms
	static class Solution {
	    public int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        
	        if(n > m) {
	        	int temp = n;
	        	n = m;
	        	m = temp;
	        }

	        //몰랐는데 최대공약수를 구하는 알고리즘을 유클리스 호제법이라고 함
	        for(int i = 1; i <= n; i++) {
	        	if(n % i == 0 && m % i == 0) {
	        		answer[0] = i;
	        	}
	        }
	        
	        answer[1] = (n*m)/answer[0];

	        return answer;
	    }
	}

}
