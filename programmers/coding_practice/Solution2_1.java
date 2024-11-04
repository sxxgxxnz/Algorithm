import java.util.*;

public class Solution2_1 {
    //택배 상자
    public static void main(String[] args) {
        int[] order = {4,3,1,2,5};
        System.out.println(solution(order));
    }

    public static int solution(int[] order){
        int answer = 0;
        int idx = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=1;i<=order.length;i++){
            stack.push(i);
            while(!stack.isEmpty()){
                if(stack.peek()==order[idx]){
                    stack.pop();
                    answer++;
                    idx++;
                }else break;
            }
        }
        return answer;
        /* 
        * 처음 풀어본 풀이는 정확성이 10점이 나왔다.
        * 다른 사람 풀이에서 stack을 하나만 두고 풀길래 나도 한번 풀어보았다.
        * 조금 더 생각해보면 풀 수 있는 방법이었다. 직관적으로 풀려고 하다보니 코드도 길어지고 오류가 많이 생긴거 같음.
        
        Stack<Integer> assist = new Stack<>();
        Stack<Integer> base = new Stack<>();
        List<Integer> truck = new ArrayList<>();

        for(int i=1;i<=order.length;i++){
            if(order[0]>i){ // 첫번째 순서 전까지 순서의 상자를 보조컨테이너에 실음
                assist.add(i);
            }else if(order[0]==i){ // 첫번째 순서 상자 실음
                truck.add(order[0]);
            }else{
                base.add(i);    //그 이후 순서는 기존 컨테이너에 실음
            }
        }

        for(int i=1;i<order.length;i++){
            int turn = order[i];
            if(assist.peek() == turn){
                truck.add(turn);
                assist.pop();
            }else if(base.peek() == turn){
                truck.add(turn);
                base.pop();
            }else{
                break;
            }
        }

        return truck.size();
        */
    }
    
}
