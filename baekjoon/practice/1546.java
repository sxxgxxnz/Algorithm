import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int a=scan.nextInt();
        double arr[]=new double[a];
        for(int i=0;i<a;i++){
            arr[i]=scan.nextDouble();
        }
        
        Arrays.sort(arr);
        double sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j]/arr[arr.length-1]*100;
        }
        System.out.println(sum/a);
    }
}
