import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int num=scan.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            int a=scan.nextInt();
            int b=scan.nextInt();
            arr[i]=a+b;
        }
        
        for(int j:arr){
            System.out.println(j);
        }
    }
}
