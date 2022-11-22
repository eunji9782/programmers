package level1;

import java.util.Arrays;

public class Lesson42748 {
	//0.50ms
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
		
		int[] solution = new Solution().solution(array, commands);
		System.out.println(Arrays.toString(solution));
	}
	
	static class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        
	        for(int i = 0; i < commands.length; i++) {
	        	int num1 = commands[i][0];
	        	int num2 = commands[i][1];
	        	int k = commands[i][2];

	        	//이부분 참고함
	        	int[] temp = Arrays.copyOfRange(array,num1-1,num2);
	        	
	        	Arrays.sort(temp);
	        	answer[i] = temp[k-1];

	    
	        }
	        return answer;
	    
	    }
	}
}
//인기순 풀이
class Solution6 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}

