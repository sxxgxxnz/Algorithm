import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8,50,17,24,3,32};
        selectionsort(arr);
    }
    public static void selectionsort(int[] a){
        int idxMin, tmp;
        for(int i=0;i<a.length-1;i++){
            idxMin = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j] < a[idxMin]){
                    idxMin = j;
                }
            }
            tmp = a[idxMin];
            a[idxMin] = a[i];
            a[i] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
