
import java.io.*;
import java.util.*;

public class Main1010 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] dp = new int[30][30];

        // 조합 성질로 인해 n == r, r == 0
        for(int i=0;i<30;i++){
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        // 조합 공식 참고
        for(int i=2;i<30;i++){
            for(int j=1;j<30;j++){
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine()," ");
            
            // m개 중 n개를 뽑는 경우 nCr에서 n = m, r = n
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(dp[m][n]).append('\n');
        }
        System.out.println(sb);
    }
}
