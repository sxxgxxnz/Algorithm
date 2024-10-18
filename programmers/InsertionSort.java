import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,50,17,24,3,32};
        insertionsort(arr);
    }
    
    public static void insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int tmp = arr[i];
            int prev = i - 1;
            while((prev >= 0) && (arr[prev] > tmp)){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
