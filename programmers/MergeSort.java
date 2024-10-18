import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,50,17,24,3,32};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] array,int left, int right){
        if(left < right){
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);
            merge(array,left,mid,right);
        }
    }
    public static void merge(int[] a, int left, int mid, int right){
        int[] L = Arrays.copyOfRange(a, left, mid+1);
        int[] R = Arrays.copyOfRange(a, mid+1, right+1);

        int i=0,j=0,k=left;
        int ll = L.length, rl = R.length;

        while(i<ll && j<rl){
            if(L[i] <= R[j]){
                a[k] = L[i++];
            } else{
                a[k] = R[j++];
            }
            k++;
        }

        while(i<ll){
            a[k++]=L[i++];
        }

        while(j<rl){
            a[k++]=R[j++];
        }
    }
}
