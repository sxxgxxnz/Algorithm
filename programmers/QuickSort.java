import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8,50,17,24,3,32};
        lquicksort(arr,0,arr.length-1);
        
    }
    /*
        왼쪽 피벗 선택
     * @param a 정렬할 배열
     * @param lo 현재 부분배열의 왼쪽
     * @param hi 현재 부분배열의 오른쪽
     * 
     */
    private static void lquicksort(int[] a,int lo, int hi){
        // lo가 hi보다 크거나 같다면 정렬할 원소가 1개 이하이므로 정렬하지 않고 return
        if(lo >= hi){
            return;
        }

        int pivot = partition(a,lo,hi);
        lquicksort(a, lo, pivot-1);
        lquicksort(a, pivot + 1, hi);
       System.out.println(Arrays.toString(a));
    }

    private static int partition(int[] a, int left, int right){
        int lo = left;
        int hi = right;
        int pivot = a[left];

        while(lo < hi){
            while(a[hi] > pivot){
                hi--;
            }

            while(a[lo] <= pivot && lo < hi){
                lo++;
            }

            swap(a,lo,hi);
        }
        System.out.println(Arrays.toString(a));
       a[left]=a[lo];
       a[lo]=pivot;
       //System.out.println(Arrays.toString(a));
        return lo;
    }

    private static void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}