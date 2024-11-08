import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int a=scan.nextInt();
        int arr[];
       
        for(int i=0;i<a;i++){
            double sum=0;
            
            int num=scan.nextInt();
            arr=new int[num];
            for(int j=0;j<num;j++){
                arr[j]=scan.nextInt();
                sum+=arr[j];
                            
            }
            double avg=sum/num;
            double count=0;
            
            for(int k=0;k<num;k++){
                if(arr[k]>avg){
                    count++;
                }
            }
            System.out.printf("%.3f%%",(count/num)*100);
            System.out.println();
        }
    }
}
