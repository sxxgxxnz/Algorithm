import java.io.*;
import java.util.StringTokenizer;

public class Main2420 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        System.out.println(Math.abs(N-M));
    }
}
