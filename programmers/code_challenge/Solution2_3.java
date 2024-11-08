//package code_challenge;

public class Solution2_3 {
    public static void main(String[] args) {
        long[] numbers = {2,7};
        solution(numbers);
    }

    public static long[] solution(long[] numbers){
        long[] answer = numbers.clone();

        for(int i=0;i<numbers.length;i++){
            answer[i]++; // x보다 큰 수
            answer[i] += (answer[i] ^ numbers[i]) >> 2;
        }
    
        return answer;
    }
}
