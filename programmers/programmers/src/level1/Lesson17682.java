package level1;

import java.util.Arrays;
import java.util.Stack;

public class Lesson17682 {

	public static void main(String[] args) {
		String str = "1D2S#10S";
		int answer = new Dart().solution(str);
		System.out.println(answer);

	}

}
//0.08ms
class Dart {
    public int solution(String dartResult) {
        int answer = 0;
        
        char[] arr = dartResult.toCharArray();
        int[] result = new int[3];
        int j = 0;
        
        for(int i = 1; i < arr.length; i++){
        	int temp = 0;
        	
        	if(i != 1 && arr[i-1] == '0') {
        		if(arr[i-2] == '1') {
        			temp = 10;
        		}
        	}else if(arr[i-1] >= '0' && arr[i-1] <= '9') {
        		temp = arr[i-1]- 48;
        	}
        	
        	if(arr[i] == 'S') {
        		result[j] += temp;
        		j++;
        	}else if(arr[i] == 'D') {
        		result[j] += Math.pow(temp, 2);
        		j++;
        	}else if(arr[i] == 'T') {
        		result[j] += Math.pow(temp, 3);
        		j++;
        	}
        	
        	if(arr[i] == '*') {
        		if(2 < i) {
        			result[j-2] *= 2;   
        			result[j-1] *= 2;   
        		}else {
        			result[j-1] *= 2;
        		}
        	}else if(arr[i] == '#') {
        		result[j-1] *= -1;  
        	}
        }
       
        for(int i = 0; i < 3; i++) {
        	answer += result[i];
        }
        
        return answer;
    }
}
//인기순 풀이 > 스택을 이용함...!
class SolutionT {
    public int solution(String dartResult) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < dartResult.length(); ++i) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                sum = (c - '0');
                if (sum == 1 && i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0') {
                    sum = 10;
                    i++;
                }
                stack.push(sum);
            } else {
                int prev = stack.pop();
                if (c == 'D') {
                    prev *= prev;
                } else if (c == 'T') {
                    prev = prev * prev * prev;
                } else if (c == '*') {
                    if (!stack.isEmpty()) {
                        int val = stack.pop() * 2;
                        stack.push(val);
                    }
                    prev *= 2;
                } else if (c == '#') {
                    prev *= (-1);
                }
                // System.out.println(prev);
                stack.push(prev);
            }
        }
        int totalScore = 0;
        while (!stack.isEmpty()) {
            totalScore += stack.pop();
        }
        return totalScore;
    }
}