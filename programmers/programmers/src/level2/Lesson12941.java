package level2;

import java.util.Arrays;

public class Lesson12941 {

	public static void main(String[] args) {

		int[] arr1 = {1,4,2};
		int[] arr2 = {5,4,4};
		
		int answer = new Solution12941().solution(arr1, arr2);
		
		System.out.println(answer);
	}

}
//효율성 2.16ms
class Solution12941{
    public int solution(int []A, int []B){
    	
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0, j = A.length-1; i < A.length; i++, j--) {
        	answer += A[i] * B[j];
        }
        
        return answer;
    }
}