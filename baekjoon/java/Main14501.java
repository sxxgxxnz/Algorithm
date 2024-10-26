
import java.io.*;
import java.util.StringTokenizer;

public class Main14501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        int[] t = new int[N];
        int[] p = new int[N];

        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        // n일에 얻을 수 있는 최대 수익
        int[] dp = new int[N+1];
        
        //현재 날짜에서 일수과 비용을 더한 값을 dp에 저장,
        // 최대값을 비교하여 넣는다.
        // dp[i + t[i]] = max(dp[i+t[i]], dp[i] + p[i])
        for(int i=0;i<N;i++){
            // 소요 일수가 N을 넘어가지 않는 경우
            if(i+t[i]<=N){
                dp[i + t[i]] = Math.max(dp[i+t[i]],dp[i]+p[i]);
            }
            //다음 dp에 현재 누적값 vs 다음 누적값의 최대값을 저장
            dp[i+1] = Math.max(dp[i+1],dp[i]);
            
        }
        System.out.println(dp[N]);
    }
}
