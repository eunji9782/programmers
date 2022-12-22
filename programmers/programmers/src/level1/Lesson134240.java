package level1;

public class Lesson134240 {

	public static void main(String[] args) {
		int food[] = {1, 7, 1, 2};
		
		String answer = new Solution134240().solution(food);
		
		System.out.println(answer);

	}
	
	

}
//30.15ms
class Solution134240 {
    public String solution(int[] food) {
        String answer = "";
        
        int num = 1;
        
        for(int i = 1; i < food.length; i++) {
        	food[i] = food[i] / 2;
        }
        
        for(int i = 1; i < food.length; i++) {
        	for(int j = 0; j < food[i]; j++) {
        		answer += num +"";
        	}
        	num++;
        }
        
        answer += "0";
        
        for(int i = food.length-1; i > 0; i--) {
        	num--;
        	System.out.println("i :" +i);
        	for(int j = 0; j < food[i]; j++) {
        		
        		answer += num +"";
        	}
        }
        return answer;
    }
}


//인기순 풀이
class Solutiona {
    public String solution(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i; 
            }
        }

        return answer;
    }
}
