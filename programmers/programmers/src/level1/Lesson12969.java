package level1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Lesson12969 {
	
	//내가 푼 풀이 333.20ms
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int j = 0; j < m; j++) {
        	for(int i = 0; i < n; i++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}
}

//인기순 풀이
class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
        //IntStream.range(0, a) : 0에서 a사이의 integer를 차례로 스트림으로 방출
        //그때마다 실행하면 되는 명령을 forEach로 정의 
        //sb.toString() 리턴할때 String으로 변환하는 역할
    }
}




