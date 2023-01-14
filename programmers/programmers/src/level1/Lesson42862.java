package level1;

import java.util.Arrays;

public class Lesson42862 {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		
		int answer = new Solution42862().solution(n, lost, reserve);
		
		System.out.println(answer);
		
	}

}

//해답보고 풀이 2.05ms, 정렬 안됨, 겹치는 값 해결 못함
class Solution42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int answer = n - lost.length;
        
        for(int i = 0; i < reserve.length; i++){
            for(int j = 0; j < lost.length; j++){
                if(reserve[i] == lost[j]){
                    answer++;
                    reserve[i] = -1;
                    lost[j] = -1;
                    break;
                }
            }
        }
        
        for(int i = 0; i < reserve.length; i++){
            for(int j = 0; j < lost.length; j++){
                if(lost[j] + 1 == reserve[i] || lost[j] -1 == reserve[i]){
                    answer++;
                    lost[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}