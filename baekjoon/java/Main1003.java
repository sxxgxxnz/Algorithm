
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1003 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            int[] fibo0 = new int[41];
            int[] fibo1 = new int[41];
            fibo0[0]=1;
            fibo0[1]=0;
            fibo1[0]=0;
            fibo1[1]=1;
            for(int j=2;j<=n;j++){
                fibo0[j]=fibo0[j-1] + fibo0[j-2];
                fibo1[j]=fibo1[j-1] + fibo1[j-2];
            }
            sb.append(fibo0[n]+" "+fibo1[n]+"\n");
        }
        System.out.println(sb);
    }
}
