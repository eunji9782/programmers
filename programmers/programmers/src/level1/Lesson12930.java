package level1;

public class Lesson12930 {

	public static void main(String[] args) {

		String str = new Solution().solution("try hello world");
		System.out.println(str);
	}
	//내가 푼 풀이 3.48ms
	static class Solution {
	    public String solution(String s) {
	        String[] arr = s.split(" ", -1);
	        //s.split(" ", -1) -1을 받아야 하는 이유
	        // " a b " 이런식으로 오면 공백유지가 안되기 때문
	        
			/*
			 * String test = "a,b,c,,,,d,";
			 * 
			 * String regex = ",";
			 * 
			 * int limit = 0;
			 * 
			 * String [] result = test.split(regex, limit); 라고 했을때 zero length string 무시가
			 * 됩니다. 결과 ----> {a,b,c}
			 * 
			 * limit = 5; 일때 배열의 최대개수는 5개 즉, limit의 수를 넘지 못합니다.
			 * 
			 * 그리고 limit이 음수일 경우! limit = -1; zero length string 도 포함하게 됩니다.
			 * 
			 * 결과 ----> {a,b,"","",c}
			 */
	        
	        String answer = "";
	        for(int i = 0; i < arr.length; i++) {
	        	String[] arr2 = arr[i].split("");
	        	for(int j = 0; j < arr2.length; j++) {
	        		if(j % 2 == 0) {
	        			arr2[j] = arr2[j].toUpperCase();
	        		}else {
	        			arr2[j] = arr2[j].toLowerCase();
	        		}
	        		answer += arr2[j]; 
	        	}
	        	if(i < arr.length-1) 
	        		answer += " ";
	        }
	        return answer;
	    }
	}

}

//인기순 풀이
class Solution3 {
	  public String solution(String s) {

	        String answer = "";
	        int cnt = 0;
	        String[] array = s.split("");

	        for(String ss : array) {
	            cnt = ss.contains(" ") ? 0 : cnt + 1; //한번에 자른 다음 공백기준으로 cnt 증갈
	            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
	        }
	      return answer;
	  }
	}

