import java.io.*;
import java.util.*;

public class Main10866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<Integer>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push_front")){
                stack.addFirst(Integer.parseInt(st.nextToken()));
            }else if(cmd.equals("push_back")){
                stack.addLast(Integer.parseInt(st.nextToken()));
            }else if(cmd.equals("pop_front")){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(stack.pollFirst()).append("\n");
                }
            }else if(cmd.equals("pop_back")){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(stack.pollLast()).append("\n");
                }
            }else if(cmd.equals("size")){
                sb.append(stack.size()).append("\n");
            }else if(cmd.equals("empty")){
                if(stack.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(cmd.equals("front")){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(stack.peekFirst()).append("\n");
                }
            }else if(cmd.equals("back")){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(stack.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
