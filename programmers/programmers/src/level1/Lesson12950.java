package level1;

import java.util.Arrays;

public class Lesson12950 {

	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		int[][] answer = new Solution().solution(arr1, arr2);
		System.out.println(Arrays.toString(answer));

	}
	//내가 푼 풀이 14.85ms
	static class Solution {
	    public int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = new int[arr1.length][arr1[0].length];
	        
	        for(int i = 0; i < arr1.length; i++) {
	        	for(int j = 0; j < arr1[i].length; j++) {
	        		answer[i][j] = arr1[i][j] + arr2[i][j];
	        	}
	        }

	        return answer;
	    }
	}

}

//인기순 풀이
class Solution1 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1; //아예 arr1을 설정함
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}