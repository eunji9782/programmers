package level1;

import java.util.HashSet;
import java.util.Set;

public class Lesson1845 {

	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,4};
		System.out.println(new Pokemon().solution(nums));

	}

}
//6.39ms
class Pokemon {
    public int solution(int[] nums) {
        int answer = 0;
        int type = nums.length / 2;
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
        	set.add(nums[i]);
        }
        
        if(set.size() >= type) {
        	answer = type;
        }else {
        	answer = set.size();
        }

        return answer;
    }
}
