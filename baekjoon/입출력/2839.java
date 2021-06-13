import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int a=scan.nextInt();
       
        if(a==4 || a==7){
            System.out.println("-1");
        }
        else if(a%5==0){
            System.out.println(a/5);
        }else if(a%5==1 || a%5==3){
            System.out.println((a/5)+1);
        }else if(a%5==2 || a%5==4){
            System.out.println((a/5)+2);
        }
    }
}
