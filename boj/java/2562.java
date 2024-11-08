import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        List<Integer> list=Arrays.asList(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
        
        int max=Collections.max(list);
        int index=list.indexOf(max)+1;
        System.out.println(max+"\n"+index);
        
        
    }
}
