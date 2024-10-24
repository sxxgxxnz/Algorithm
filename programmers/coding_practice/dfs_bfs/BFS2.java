package coding_practice.dfs_bfs;
import java.util.*;

public class BFS2 {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println(solution(numbers,target));
    }

    public static int solution(int[] numbers, int target){
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        for(int i=0;i<numbers.length;i++){
            int size = queue.size();
            for(int j=0;j<size;j++){
                int sum = queue.poll();
                queue.add(sum+numbers[i]);
                queue.add(sum-numbers[i]);
            }
        }
        
        while(!queue.isEmpty()){
            if(queue.poll() == target){
                answer++;
            }
        }
        return answer;
    }
}
