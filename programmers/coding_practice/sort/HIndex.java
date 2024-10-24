package coding_practice.sort;
import java.util.*;

public class HIndex {
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        System.out.println(solution(citations));
    }    

    public static int solution(int[] citations){
        int answer = 0;

        Arrays.sort(citations);

        for(int i=0;i<citations.length;i++){
            int h = citations.length - i; // 인용된 논문 수

            if(citations[i]>=h){
                answer = h;
                break;
            }
        }
        return answer;
    }
}
