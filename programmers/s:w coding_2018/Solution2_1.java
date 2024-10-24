import java.util.*;

public class Solution2_1 {
    public static void main(String[] args){
        int n = 5;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int min =0;
        while(n>0){
            if(n%2==1){
                min+=1;
            }
            n/=2;
        }
        return min;
    }
}
