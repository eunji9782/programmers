package level1;

public class Lesson68935 {

	public static void main(String[] args) {

		int num = new Solution().solution(125);
		System.out.println(num);
	}
	
	//내가 푼 풀이 3.94ms
	static class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        String str = "";
	        while(n > 0) {
	        	str += String.valueOf(n % 3);
	        	n /= 3;
	        }

	        double j = 0;
	        
	        for(int i = str.length()-1; i >= 0; i--) {
	        	answer += (int)Math.pow(3, j) * (str.charAt(i) - '0');
	        	j++;
	        }
	        return answer;
	    }
	}

}

//인기순 풀이
class Solution4 {
    public int solution(int n) {
        String a = "";

        while(n > 0){
            a = a + (n % 3);
            n /= 3;
        }
        
        return Integer.parseInt(a,3);
        //Integer.parseInt(String s, int radix) : 진수값 (int radix)
        //3진수를 10진수로 바꿔준다...
    }
}