import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        
        num1=Integer.parseInt(new StringBuilder().append(num1).reverse().toString());
        num2=Integer.parseInt(new StringBuilder().append(num2).reverse().toString());
        
        if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}
