package level1;

import java.util.Arrays;

public class Lesson12917 {

	public static void main(String[] args) {
		String answer = new Solution().solution("Zbcdefg");
		System.out.println(answer);
	}
	
	
	//내가 푼 풀이 14.77ms
	private static class Solution {
	    public String solution(String s) {
	        String answer = "";
	        char[] c = s.toCharArray();
	        
	        for(int i = 0; i < c.length; i++) {
	        	for(int j = i+1; j < c.length; j++) {
	        		if(c[i] < c[j]) {
	        			int temp = c[i];
	        			c[i] = c[j];
	        			c[j] = (char) temp;
	        		}
	        	}
	        	answer+=c[i];
	        }
	        
	        return answer;
	    }
	}
}



//인기순 풀이
class ReverseStr {
    public String reverseStr(String str){
    char[] sol = str.toCharArray();
    Arrays.sort(sol);
    
    return new StringBuilder(new String(sol)).reverse().toString();
    //StringBuilder에 정렬함수 있음...!
    }
}