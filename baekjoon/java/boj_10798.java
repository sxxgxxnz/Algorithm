import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] ch = new char[5][15];
        int max = 0;

        for(int i=0;i<ch.length;i++){
            String str = br.readLine();
            // 입력 받은 문자열 중 최대 길이 저장
            if(max < str.length()) max = str.length();

            // 입력받은 문자열을 2차원 배열에 저장
            for(int j=0;j<str.length();j++){
                ch[i][j] = str.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<max;i++){
            for(int j=0;j<5;j++){
                //값이 없는 경우는 넘어간다. (\0은 char배열의 초기값)
                if(ch[j][i] == '\0') continue;
                //세로로 읽으며 열과 행을 출력
                sb.append(ch[j][i]);
            }
        }
        System.out.println(sb);
    }
}
