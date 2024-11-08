import java.io.*;

public class Main2941 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] croatiasStr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String str = br.readLine();
        

        for(String s : croatiasStr){
            while(str.contains(s)){
                str = str.replace(s,"*");
            }
        }
        System.out.println(str.length());
    }
}
