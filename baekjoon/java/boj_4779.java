import java.io.*;

public class boj_4779{
    static int n;
    static StringBuilder sb;

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str = br.readLine()) != null){ // 입력값이 없을때까지 반복
            n = Integer.parseInt(str); // 입력값 n, 3의 n승
            sb = new StringBuilder(); 
            
            int len = (int) Math.pow(3,n); // 3의 n승

            // 길이가 3의 n승, '-'로 이루어진 문자열을 미리 만든 다음 재귀함수
            for(int i=0;i<len;i++){
                sb.append("-");
            }

            func(0,len); // 시작 인덱스, 시작 길이
            System.out.println(sb);
        }
    }

    public static void func(int start, int size){
        if(size == 1){ 
            return;
        }
        int newlen = size / 3;

        // 3등분한 문자열의 가운데(2번째) 부분 공백처리
        for(int i=start+newlen;i<start+2*newlen;i++){
            sb.setCharAt(i, ' ');
        }
        func(start, newlen);    //3등분한 문자열의 첫번째
        func(start+2*newlen, newlen);   //3등분한 문자열의 세번째
    }
}