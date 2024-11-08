import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int a=scan.nextInt();
        int b=scan.nextInt();
        
        int num1=b%10;    //234%10=4
        int tmp=b/10;       //234/10=23
        int num2=tmp%10;    //23%10=3
        tmp=tmp/10;        //23/10=2
        
        System.out.println(a*num1);
        System.out.println(a*num2);
        System.out.println(a*tmp);
        System.out.println(a*b);
        
    }
}
