import java.io.*;
import java.util.*;

public class Main12865 {
    // 배낭 문제(Knapsack Algorithm) - 조합 최적화 dp문제
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] W = new int[N + 1];
        int[] V = new int[N + 1];
        int[] dp = new int[K+1]; // 수용 가능한 무게

        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine()," ");
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        
        for(int i=1;i<=N;i++){
           for(int j=K;j-W[i]>=0;j--){
                dp[j] = Math.max(dp[j],dp[j-W[i]]+V[i]);
           }

        }
        System.out.println(dp[K]);
    }
}
