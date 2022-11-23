package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lesson68644 {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		
		ArrayList<Integer> list = new Plus().solution(numbers);
		/*
		 * int[] answer = new Solution8().solution(numbers);
		 * System.out.println(Arrays.toString(answer));
		 */
		System.out.println(list);
	}
	
	

}
//6.31ms
class Plus {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
       
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		if(!list.contains(numbers[i] + numbers[j]))
        		list.add(numbers[i] + numbers[j]);
        	}
        }

       	Collections.sort(list);
       	
        return list;
    }
}


//인기순 풀이
class Solution8 {
     public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}