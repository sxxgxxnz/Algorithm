import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {8,50,17,24,3,32};
        heapsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapsort(int[] a){
        int n = a.length;

        for(int i=n/2-1;i>=0;i--){
            heapify(a,n,i);
        }

        for(int i=n-1;i>0;i--){
            swap(a,0,i);
            heapify(a,i,0);
            //System.out.println(Arrays.toString(a));
        }
    }

    public static void heapify(int[] a,int n, int i){
        int p = i;
        int l = i*2 + 1;
        int r = i*2 + 2;

        if(l < n && a[p] < a[l]){
            p = l;
        }

        if(r < n && a[p] < a[r]){
            p = r;
        }

        if(i != p){
            swap(a,p,i);
            System.out.println(Arrays.toString(a));
            heapify(a, n, p);
        }
    }

    public static void swap(int[] arr,int a,int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}