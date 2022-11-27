package level1;

public class Lesson12977 {

	public static void main(String[] args) {

		int[] nums = {1,2,7,6,4};
		int answer = new MadePrime().solution(nums);
		
		System.out.println(answer);
	}

}
//12.78ms
class MadePrime {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++) {
        	for(int j = i+1; j < nums.length; j++) {
        		for(int n = j+1; n < nums.length; n++) {
        			
        			boolean check = false;
        			int sum = nums[i] + nums[j] + nums[n];
        			
        			for(int k = 2; k <= Math.sqrt(sum); k++) {
        				if(sum % k == 0) {
        					check = true;
        					continue;
        				}
        			}
        			if(!check) {
        				answer++;
        			}
        		}
        	}
        }
        

        return answer;
    }
}