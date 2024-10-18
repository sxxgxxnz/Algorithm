import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,3,7,5,4,2};
        bubblesort(arr);
    }
    public static void bubblesort(int[] a){
        bubblesort(a,a.length);
    }
    private static void bubblesort(int[] a, int size){
        for(int i=0;i<size;i++){
            for(int j=1;j<size-i;j++){
                if(a[j-1] > a[j]){
                    int tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                }
            }
        }
       
       System.out.println(Arrays.toString(a));
    }
}