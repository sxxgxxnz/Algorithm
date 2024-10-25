import java.util.Stack;

public class Solution2_1 {
    public static void main(String[] args) {
        int[] numbers = {9,1,5,3,6,2};

        System.out.println(solution(numbers));
    }

    public static int[] solution(int[] numbers){
        // 정답 배열
        int[] answer = new int[numbers.length];
        // numbers index 정보를 담을 스택
        Stack<Integer> stack = new Stack<>();
        
        stack.push(0); // 첫번째 number index push

        // 두번째부터 탐색
        for(int i=1;i<numbers.length;i++){
            //스택이 비어있지 않고 현재 스택 top에 있는 값보다 numbers의 값이 크면 뒤에 있는 큰 수 
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
                answer[stack.pop()] = numbers[i];
            }

            //현재 인덱스 푸쉬
            stack.push(i);
        }
        //뒤에 큰수가 없는 경우 -1
        while(!stack.isEmpty()){
            answer[stack.pop()]=-1;
        }
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
        return answer;
        }
    }
