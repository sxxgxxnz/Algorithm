import java.io.*;
import java.util.*;

public class Main2563_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0; // 너비
        int n = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[101][101];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            //(x + 9, y + 9) 까지의 영역을 체크 후 총 너비에 더한다. 
            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    if(!arr[j][k]){
                        arr[j][k] = true;
                        total++;
                    }
                }
            }
        }
        System.out.println(total);
    }
}
