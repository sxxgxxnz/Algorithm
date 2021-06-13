import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        int a=Integer.parseInt(br.readLine());
        
        for(int i=1;i<=a;i++){
            st = new StringTokenizer(br.readLine()," ");
            int num1=Integer.parseInt(st.nextToken());
            int num2=Integer.parseInt(st.nextToken());
            
            System.out.println("Case #"+i+": "+num1+" + "+num2+" = "+(num1+num2));    
        }
        
        
    }
}

