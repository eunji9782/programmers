package level1;

public class Lesson132267 {

	public static void main(String[] args) {
		int a = 3;
		int b = 1;
		int n = 20;
		int answer = new Coke().solution(a, b, n);
		System.out.println(answer);

	}

}
//0.09ms
class Coke {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
        	
        	int temp = n / a;
        	
        	answer += temp * b;
       
        	n = (temp * b) + (n%a);
        }
        return answer;
    }
}