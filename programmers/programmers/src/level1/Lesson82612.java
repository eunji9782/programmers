package level1;

public class Lesson82612 {
	
	public static void main(String[] args) {
		long answer = new Solution().solution(3, 20, 4);
		System.out.println(answer);

	}
	
	//내가 푼 풀이 0.17ms
	private static class Solution {
	   public long solution(int price, int money, int count) {
	        
		    long answer = 0;
		   
		    long sum = 0;
	        for(long i = 1; i <= count; i++) {
	        	sum += price * i;
	        }
	        
	        if(money < sum) {
	        	answer = sum - money;
	        }else {
	        	answer = 0;
	        }
	      
	        return answer;
	    }
	}

}

//인기순 풀이
class SolutionMax {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0); 
        // r(n(n+1))/2 등차수열 합공식...
        //Math.max(a, b) 두 값중 큰값을 리턴하는 함수이다!
    }
}

