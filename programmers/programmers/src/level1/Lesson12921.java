package level1;

public class Lesson12921 {

	public static void main(String[] args) {

		int answer = new PrimeNumber().solution(1000000);
		System.out.println(answer);
	}

}

class PrimeNumber {
    public int solution(int n) {
		/* 시간초과
		 * int answer = 0;
		 * 
		 * for(int i = 2; i <= n; i++) { boolean checkPrime = false;
		 * 
		 * if(i % 2 == 0 && i != 2) { continue; }
		 * 
		 * 
		 * for(int j = 2; j < i-1; j++) { if(i % j == 0) { checkPrime = true; continue;
		 * } }
		 * 
		 * if(!checkPrime) { answer++; } }
		 */
    	//에라토스테네스의 체를 이용한 풀이
    	int answer = 0;
    	
    	int[] arr = new int[n + 1];

        for (int i = 2; i <= (int) Math.sqrt(n); ++i) {
            if (arr[i] == 1) continue;
            for (int j = i + i; j <= n; j += i) {
                arr[j] = 1;
            }
        }
        
        for (int i = 2; i < arr.length; ++i) {
            if (arr[i] != 1) ++answer;
        }

        return answer;
    }
}