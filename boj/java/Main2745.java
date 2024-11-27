import java.io.*;
import java.util.*;

public class Main2745 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int a = 1; // x진법^n을 하기 위한 변수
        int result = 0;
        for(int i=N.length()-1;i>=0;i--){
            char c = N.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                result += (c - 'A' + 10) * a;
            }else{
                result += (c - '0') * a;
            }
            a *= B;
        }
        System.out.println(result);
    }
}
