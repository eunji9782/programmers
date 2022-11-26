package level1;


import java.util.ArrayList;

public class Lesson42820 {

	public static void main(String[] args) {

	}

}
//풀이 실패.. i%tester1.length라는 공식을 생각하지 못했다... 5.38ms
class Test {
    public int[] solution(int[] answers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] tester1 = {1,2,3,4,5};
        int[] tester2 = {2,1,2,3,2,4,2,5};
        int[] tester3 = {3,3,1,1,2,2,4,4,5,5};
        
        int testerScore1 = 0;
        int testerScore2 = 0;
        int testerScore3 = 0;
        
        for(int i = 0; i < answers.length; i++) {
        	if(tester1[i%tester1.length]==answers[i]) {
        		testerScore1++;
        	}
        	
        	if(tester2[i%tester2.length]==answers[i]) {
        		testerScore2++;
        	}
        	
        	if(tester3[i%tester3.length]==answers[i]) {
        		testerScore3++;
        	}
        }
        //max가 받는 인수는 최대 2개
        int max = Math.max(Math.max(testerScore2, testerScore3), testerScore1);
        
        if(max == testerScore1) {
        	list.add(1);
        }
        
        if(max == testerScore2) {
        	list.add(2);
        }
        if(max == testerScore3) {
        	list.add(3);
        }
        
        answer = list.stream().mapToInt(i -> i.intValue()).toArray();
        
        
        return answer;
    }
}
