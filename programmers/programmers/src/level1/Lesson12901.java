package level1;

import java.util.Calendar;

public class Lesson12901 {

	public static void main(String[] args) {
		String answer = new Solution2016().solution(3, 31);
		System.out.println(answer);

	}

}

//30.76ms
class Solution2016 {
	//calendar 클래스를 이용하자
    public String solution(int a, int b) {
    	 String[] answer = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
    	 Calendar cal = Calendar.getInstance();
    	 cal.set(2016, a-1, b);
    	 
    	 //System.out.println(cal);
    	 
    	 int day = cal.get(Calendar.DAY_OF_WEEK);

    	 
         return answer[day-1];
        
    }
}

//인기순 풀이
class TryHelloWorld
{
    public String getDayName(int a, int b) {
        String answer = "";
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }
        allDate += (b - 1); //1월 1일도 하루지난걸로 판단해서 뺌
        answer = day[allDate % 7];

        return answer;
    }
}