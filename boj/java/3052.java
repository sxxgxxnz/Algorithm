import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        HashSet<Integer> hs=new HashSet<Integer>();
        
        for(int i=0;i<10;i++){
            hs.add(scan.nextInt()%42);
        }
        
        System.out.println(hs.size());
    }
}
