import java.io.*;
import java.util.StringTokenizer;

public class Main2563 {
    //틀린코드
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = n * 100;
        int[][] xy = new int[n+1][2];
        StringTokenizer st;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            xy[i][0] = x;
            xy[i][1] = y;

        }

        // 2. 겹치는 부분 check
        for(int i=0;i<xy.length;i++){
            for(int j=i+1;j<xy.length;j++){
            //겹치는 조건
            if(Math.abs(xy[i][0] - xy[j][0]) < 10 && Math.abs(xy[i][1] - xy[j][1]) < 10){
                /*if(xy[i][0] == xy[i-1][0] || xy[i][1] == xy[i-1][1]){

                }else if(xy[i][0] > xy[i-1][0]){
                }*/
                
                if((xy[i][0] < xy[j][0] && xy[i][1] < xy[j][1]) || 
                    (xy[i][0] > xy[j][0] && xy[i][1] > xy[j][1])){
                        int height = (Math.min(xy[i][1], xy[j][1]) + 10) - Math.max(xy[i][1], xy[j][1]);
                        int width = (Math.min(xy[i][0], xy[j][0]) + 10) - Math.max(xy[i][0], xy[j][0]);

                        result -= height * width;
                        break;
                }
            }
        }
        }
        System.out.println(result);
    }
}
