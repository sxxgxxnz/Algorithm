import java.io.*;
import java.util.*;

public class Main1966 {
    // 프린터 큐 (다시 리뷰해볼 것)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for(int j=0;j<n;j++){
                int num = Integer.parseInt(st.nextToken());
                queue.add(new int[] {j, num});
            }

            int cnt = 0;
            while(!queue.isEmpty()){
                int[] tmp = queue.poll(); 
                boolean check = true;   // tmp 원소의 중요도가 가장 큰 원소인지 

                for(int j=0;j<queue.size();j++){
                    // 맨 처음 뽑은 원소보다 큐에 있는 i번째 원소의 중요도가 더 큰 경우 
                    // 나머지 원소들을 모두 뒤로 보낸다
                    if(tmp[1] < queue.get(j)[1]){
                        queue.offer(tmp);
                        for(int k=0;k<j;k++){
                            queue.offer(queue.poll());
                        }

                        check = false;
                        break;
                    }
                }

                if(check == false){
                    continue;
                }

                cnt++;
                if(tmp[0] == m){
                    break;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
