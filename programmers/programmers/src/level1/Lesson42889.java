package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson42889 {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] answer = new Failure().solution(N, stages);
		System.out.println(Arrays.toString(answer));

	}

}

//풀이 실패...
class Failure {
    public int[] solution(int N, int[] stages) {
    	//실패율을 담는 리스트
    	 int[] answer = new int[N];
         double users =stages.length;
         List<double[]> fail_rate = new ArrayList<>();
         
         int cnt=0;
         
         for(int i=1;i<=N;i++){
             for(int j=0;j<stages.length;j++){
                 if(i==stages[j]){
                     cnt++;
                 }
             }
            if(cnt==0){
               fail_rate.add(new double[]{i,0});
               continue;
           }
           fail_rate.add(new double[]{i,cnt/users});
           users-=cnt;
           cnt=0;
         }
         
         //한 줄로도 쓸수가있다!
         //안의 값들을 비교하며 큰수부터 나열하게 됨 (내림차순)
         fail_rate.sort((a,b)->Double.compare(b[0],a[0]));

         for(int i=0;i<fail_rate.size();i++){
             answer[i]=(int)fail_rate.get(i)[0];
         }
         
         return answer;
     }
}