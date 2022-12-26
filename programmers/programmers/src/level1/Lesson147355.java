package level1;

public class Lesson147355 {

	public static void main(String[] args) {

		String t = "10203";
		String p = "15";
		
		int result = new Solution().solution(t, p);
		
		System.out.println(result);
	}
	//32.97ms
	static class Solution {
	    public int solution(String t, String p) {
	        int answer = 0;
	        
	        for(int i = 0; i < t.length()-p.length()+1; i++) {
	        	String temp = t.substring(i, i+p.length());
	        	System.out.println(temp);
	        	if(Long.parseLong(temp) <= Long.parseLong(p)) {
	        		answer++;
	        	}
	        }

	        return answer;
	    }
	}

}
