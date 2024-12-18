import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2748_1 {
    static long[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new long[n+1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i=2;i<=n;i++){
            arr[i] = -1;
        }
        
        System.out.println(fib(n));
    }

    public static long fib(int n){
        if(arr[n]==-1){
            arr[n] = fib(n-1) + fib(n-2);
        }
        return arr[n];
    }
}
