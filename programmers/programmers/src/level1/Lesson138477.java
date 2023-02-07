package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Lesson138477 {

	public static void main(String[] args) {
		int k =3;
		int[] score = {10,100,20,150,1,100,200};
		
		int[] answer = new Solution321().solution(k, score);
		
		System.out.println(Arrays.toString(answer));

	}

}
//29.90ms
class Solution138477 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        LinkedList<Integer> scoreList = new LinkedList<Integer>();
        
        
        for(int i = 0; i < score.length; i++) {
        	if(scoreList.size() < k) {
        		scoreList.add(score[i]);
        		
        		Collections.sort(scoreList);
        		
        		
        	}else {
        		for(int j = k; j > 0; j--) {
        			if(score[i] > scoreList.get(j-1)) {
        				scoreList.add(j, score[i]);
        				scoreList.remove(0);
        				break;
        			}
        		}
        		
        	}
        	System.out.println(scoreList);
        	answer[i] = scoreList.get(0);
        	
        }

        return answer;
    }
}

class Solution321 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int temp = 0;

        for(int i = 0; i < score.length; i++) {

            priorityQueue.add(score[i]);
            System.out.println(priorityQueue);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
                System.out.println("조건 :" +priorityQueue);
            }

            answer[i] = priorityQueue.peek();
        }



        return answer;
    }
}