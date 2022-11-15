package level1;

public class Lesson12918 {

	public static void main(String[] args) {
		boolean answer = new Solution().solution("1234");
		System.out.println(answer);

	}
	
	//내가 푼 풀이 0.04ms
	private static class Solution {
	    public boolean solution(String s) {
	        boolean answer = true;
	        if(s.length() != 4 && s.length() != 6) {
	        	answer = false;
	        	return answer;
	        }
	        
	        char[] cArr = s.toCharArray();
	        
	        for(int i = 0; i < cArr.length; i++) {
	        	if(cArr[i] - '0' < 0 || cArr[i]- '0' > 9) {
	        		answer = false;
	        		break;
	        	}
	        }

	        return answer;
	    }
	}

}

//인기순 풀이
class Solution {
	  public boolean solution(String s) {
	      if(s.length() == 4 || s.length() == 6){
	          try{
	              int x = Integer.parseInt(s);
	              return true;
	          } catch(NumberFormatException e){ //에러 캐치를 이용함...! 
	              return false;
	          }
	      }
	      else return false;
	  }
	}


