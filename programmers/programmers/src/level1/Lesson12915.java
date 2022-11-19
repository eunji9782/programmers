package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lesson12915 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] strings = {"abce", "abcd", "cdx"};
	        int n = 2;

	        String[] answer = new Solution().solution(strings, n);
	        System.out.println(Arrays.toString(answer));

	}
	//2번째만 비교하는 부분은 풀었지만 같으면 3번째부터 푸는 부분은 풀지못해 참고한 인기순 풀이
	static class Solution {
	    public String[] solution(String[] strings, int n) {
	        String[] answer = {};
	        ArrayList<String> arr = new ArrayList<>();
	        for (int i = 0; i < strings.length; i++) {
	            arr.add(strings[i].charAt(n) + strings[i]); //2번째 글자 + 원래 글자로 해서 오름차순 정렬
	        }
	        Collections.sort(arr);
	        answer = new String[arr.size()];
	        for (int i = 0; i < arr.size(); i++) {
	            answer[i] = arr.get(i).substring(1, arr.get(i).length());
	        }
	        return answer;
	    }
	}
}
