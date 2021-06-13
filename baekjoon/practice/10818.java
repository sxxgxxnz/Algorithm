import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int size=scan.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
            
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[size-1]);
    }
}
