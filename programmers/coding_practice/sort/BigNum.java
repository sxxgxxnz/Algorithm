package coding_practice.sort;
import java.util.*;

public class BigNum {
    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        System.out.println(solution(numbers));
    }

    public static String solution(int[] numbers){
        String[] arr = new String[numbers.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        //두 수를 합친 값이 큰 순서대로 (내림차순)
        // o1 : 10
        // o2 : 2
        // 인 경우 102와 210 중 뭐가 더 큰지 비교
        Arrays.sort(arr,(o1,o2) -> (o2+o1).compareTo(o1+o2));

        //첫번째 수가 0이면 0으로만 이뤄진 배열이므로 0을 리턴
        if(arr[0].equals("0")){
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}