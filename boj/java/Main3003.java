import java.io.*;
import java.util.StringTokenizer;

public class Main3003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] chess = {1,1,2,2,2,8};

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<chess.length;i++){
            int num = chess[i]-Integer.parseInt(st.nextToken());
            sb.append(num+" ");
        }
        System.out.println(sb);
    }
}
