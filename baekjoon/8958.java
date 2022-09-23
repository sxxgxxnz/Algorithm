import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int a=scan.nextInt();
        String str[]=new String[a+1];
        
        for(int i=0;i<a;i++){
            str[i]=scan.next();
            int sum=0,count=0;
            for(int j=0;j<str[i].length();j++){
                if(str[i].charAt(j)=='O'){
                    sum+=++count;
                }else{
                    count=0;
                }
            }
            System.out.println(sum);
        }
        
    }
}
