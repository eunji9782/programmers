package level1;

public class Lesson81301 {

	public static void main(String[] args) {
		
		int answer = new Solution().solution("one4seveneight");
		System.out.println(answer);

	}
	//0.30ms
	static class Solution {
	    public int solution(String s) {
	    	System.out.println(s);
	    	int answer = 0;

	        s = s.replace("zero", "0").replace("one", "1").replace("two", "2").replace("three", "3").replace("four", "4").replace("five", "5").replace("six", "6").replace("seven", "7").replace("eight", "8")
	        		.replace("nine", "9");
	    
	        answer = Integer.parseInt(s);

	        return answer;
	    }
	}

}

//인기순 풀이
class Solution7 {
    public int solution(String s) {
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
}
