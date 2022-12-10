package level1;

import java.util.Arrays;

public class Lesson77484 {

	public static void main(String[] args) {
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		
		int answer[] = new Lotto().solution(lottos, win_nums);
		System.out.println(Arrays.toString(answer));
	}

}
//0.03ms
class Lotto {
	public int[] solution(int[] lottos, int[] win_nums) {
		
        int[] answer = new int[2];
        
        int count = 0;
        int zero = 0;
        
        for(int i = 0; i < lottos.length; i++) {
        	
        	if(lottos[i] == 0) {
        		zero++;
        	}
        	
        	for(int j = 0; j < win_nums.length; j++) {
        		if(lottos[i] == win_nums[j]) {
        			count++;
        		}
        	}
        }
        
        if(zero == 6) {
        	answer[0] = 1;
        }else {
        	answer[0] = rank(count+zero);        	
        }
        answer[1] = rank(count);
        
        return answer;
        
    }
	//스위치를 썼으면 가독성이 좋아지지 않았을까?
	public int rank(int num) {
		if(num == 6) {
			num = 1;
		}else if(num == 5) {
			num = 2;
		}else if(num == 4) {
			num = 3;
		}else if(num == 3) {
			num = 4;
		}else if(num == 2) {
			num = 5;
		}else{
			num = 6;
		}
		return num;
	}

}
