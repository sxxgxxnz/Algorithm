import java.io.*;
import java.util.Arrays;

public class Main12852 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N+1]; // 최소 횟수
        int[] process = new int[N+1]; //경로
        Arrays.fill(dp,Integer.MAX_VALUE);

        dp[1]=0;
        //최소 연산 횟수
        for(int i=2;i<=N;i++){
            //3으로 나누어 떨어지고
            //현재 횟수 > 3으로 나눴을 때 횟수 + 1
            if(i%3 == 0 && dp[i] > dp[i/3]+1){
                dp[i]=dp[i/3]+1;
                process[i]=i/3;
            }
            if(i%2==0 && dp[i] > dp[i/2]+1){
                dp[i] = dp[i/2]+1;
                process[i]=i/2;

            }
            if(i-1>0 && dp[i] > dp[i-1]+1){
                dp[i] = dp[i-1]+1;
                process[i] = i-1;
            }
        }

        bw.write(String.valueOf(dp[N])+"\n");
        int num = N;
        for(int i=0;i<=dp[N];i++){
            bw.write(String.valueOf(num)+" ");
            num = process[num];
        }

        bw.flush();
    }
}
 