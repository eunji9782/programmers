package level1;

import java.util.Arrays;

public class Lesson142086 {

	public static void main(String[] args) {
		String s = "banana";
		
		int[] answer = new Solution142086().solution(s);
		
		System.out.println(Arrays.toString(answer));
	}

}

//102.42ms
class Solution142086 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < i; j++){
                if(s.charAt(j) == s.charAt(i))
                   answer[i] = i-j;
            }
            
            if(answer[i] == 0){
                answer[i] = -1;
            }
        }
        return answer;
    }
}