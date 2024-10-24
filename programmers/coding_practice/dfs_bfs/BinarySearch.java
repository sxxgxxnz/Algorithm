package coding_practice.dfs_bfs;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {8,50,17,24,3,32};
        int M = 24;
        int index = solution(arr,M);
        System.out.println(Arrays.toString(arr));
        System.out.println(index);
    }

    public static int solution(int[] arr,int M){
        Arrays.sort(arr);
        
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while(start <= end){
            mid = (start + end) / 2;
            if(M == arr[mid]){
                return mid;
            } else if(arr[mid] < M) {
                start = mid + 1;
            }else if(M < arr[mid]){
                end = mid - 1;
            }
        }
        throw new NoSuchElementException("존재하지 않음");
    }
}
