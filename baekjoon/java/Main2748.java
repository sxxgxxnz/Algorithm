import java.io.*;

public class Main2748 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long sum = 1;
        long f1 = 0;
        long f2 = 1;

        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<n;i++){
           sum = f1 + f2;
           f1 = f2;
           f2 = sum;
        }

        
        System.out.println(sum);
    }
}
