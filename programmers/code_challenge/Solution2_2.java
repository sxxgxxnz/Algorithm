import java.util.*;

public class Solution2_2 {
    public static void main(String[] args) {
        String str = "[)(]";
        System.out.println(solution(str));
    }

    public static int solution(String s){
        int result = 0;
        for(int i=0;i<s.length();i++){
            Stack<Character> stack = new Stack<>();
            String str = s.substring(i, s.length()) + s.substring(0, i);

            for(int j=0;j<str.length();j++){
                char c = str.charAt(j);
                if(stack.isEmpty()){
                    stack.push(c);
                }else if(c == ')' && stack.peek() == '('){
                    stack.pop();
                }else if(c == '}' && stack.peek() == '{'){
                    stack.pop();
                }else if(c == ']' && stack.peek() == '['){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
            if(stack.isEmpty()){
                result++;
            }
        }
        return result;
    } 
}
