import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int cnt=0;
        int num=scan.nextInt();
        int temp=num;
        while(true){
            num=((num%10)*10)+(((num/10)+(num%10))%10);
                
            cnt++;
            
            if(num==temp){
                break;
            }
        }
        System.out.println(cnt);
    }
}
