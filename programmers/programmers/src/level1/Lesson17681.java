package level1;

import java.util.Arrays;

public class Lesson17681 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 1, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};

		String[] answer = new Solution().solution(n, arr1, arr2);
		System.out.println(Arrays.toString(answer));
	}
	
	//풀이 5.58ms
	static class Solution {
	    public String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] answer = new String[n];
	        
	       for(int i = 0; i < n; i++) {
				/* 런타임 오류남 : int 범위 초과
				 * arr1[i] = Integer.parseInt(Integer.toString(arr1[i], 2)); 
				 * arr2[i] = Integer.parseInt(Integer.toString(arr2[i], 2));
				 */
	    	   System.out.println(arr1[i] | arr2[i]);
	    	   answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); //새로 추가
	    	   
	    	   if(answer[i].length() < n) {
	    		   String temp = answer[i];
	    		   answer[i] = "";
	    		   for(int j = 0; j < n - temp.length(); j++) {
	    			   answer[i] += "0";
	    		   }
	    		   answer[i] += temp;
	    	   }

	    	   answer[i] = answer[i].replaceAll("0", " ");
	    	   answer[i] = answer[i].replaceAll("[1-9]", "#");
	       }
			

	        return answer;
	    }
	}
}

//인기순 풀이
class SolutionC {
	  public String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] result = new String[n];
	        for (int i = 0; i < n; i++) {
	            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
	        }

	        for (int i = 0; i < n; i++) {
	            result[i] = String.format("%" + n + "s", result[i]);
	            result[i] = result[i].replaceAll("1", "#");
	            result[i] = result[i].replaceAll("0", " ");
	        }

	        return result;
	    }
	}

//재귀함수 풀이
class SolutionB {
    public String makeSharp(int n, int m) { // 31 5
        if(n == 0) {
            if(m > 0) {
                String str = "";
                for(int i = 0; i < m; i++) {
                    str += " ";
                }
                return str;
            }
            else return "";
        }
        else {
            return n % 2 == 0 ? makeSharp(n/2, m-1) + " " : makeSharp(n/2, m-1) + "#"; 
        }
    }
    public String[] solution(int n, int [] arr1, int [] arr2) {
        String [] answer = new String[n];
        int [] secretMap = new int[n];
        for(int i = 0; i < n; i++) {
            secretMap[i] = arr1[i] | arr2[i]; //2진수에서 or연산 후 10진수로 바꾼 값과 같음
            answer[i] = makeSharp(secretMap[i], n);
        }
        return answer;
    }
}
