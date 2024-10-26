
import java.io.*;

public class Main1003_1 {
    static int zero;
    static int one;
    static int zeroOne;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            sb.append(zero).append(" ").append(one).append("\n");
        }
        System.out.println(sb);
    }
    public static void fibonacci(int n){
        zero = 1;
        one = 0;
        zeroOne = 1;

        for(int i=0;i<n;i++){
            zero = one;
            one = zeroOne;
            zeroOne = zero + one;
        }
    }
}
