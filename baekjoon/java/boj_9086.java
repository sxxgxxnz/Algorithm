import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9086 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];

        StringBuilder sb;
        for(int i=0;i<n;i++){
            String str = br.readLine();
            sb = new StringBuilder();
            sb.append(str.charAt(0)).append(str.charAt(str.length()-1));
            strArr[i] = sb.toString();
        }

        for(int i=0;i<strArr.length;i++){
            System.out.println(strArr[i]);
        }

    }
}
