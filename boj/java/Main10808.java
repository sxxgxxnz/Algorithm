import java.io.*;

public class Main10808 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];

        String s = br.readLine();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int idx = c - 97;
            arr[idx] += 1;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
