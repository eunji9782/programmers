package level1;

public class Lesson12926 {

	public static void main(String[] args) {
		String answer = new Solution().solution("Y", 10);
		System.out.println(answer);
	}
	
	//내가 푼 풀이 0.49ms
	static class Solution {
	    public String solution(String s, int n) {
	        String answer = "";
	        char[] str = s.toCharArray();
	        
	        for(int i = 0; i < str.length; i++) {
	        	if(str[i] == ' ') {
	        		continue;
	        	}else if(str[i] <= 90){
	        		str[i] += n;
	        		if(str[i] > 90) str[i] -= 26;
	        	}else {
	        		str[i] += n;
	        		if(str[i] > 122) str[i] -= 26;

	        	}
	       
	        }
	        
	        answer = String.valueOf(str);
	        
	        return answer;
	    }
	}

}

//인기순 풀이
class Caesar {
    String caesar(String s, int n) {
        String result = "";
        n = n % 26; //오.. 26으로 나누면 순환될 때 조건을 간단히 할 수 있다
        
        for (int i = 0; i < s.length(); i++) {
	      char ch = s.charAt(i);
		      if (Character.isLowerCase(ch)) {
		        ch = (char) ((ch - 'a' + n) % 26 + 'a');
		      } else if (Character.isUpperCase(ch)) {
		        ch = (char) ((ch - 'A' + n) % 26 + 'A');
		        //(A/a와 원래 문자의 차이 + 밀리는 수 n)을 26으로 나눈 나머지 = 루프를 돌고나서의 차이
		      }
	      result += ch;
	    }
        return result;
    }
}