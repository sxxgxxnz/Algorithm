package coding_practice.dfs_bfs;
import java.util.Arrays;

public class DFS4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(8,1)));
    }
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sum = brown + yellow;
        for(int i=sum/2;i>0;i--){
            if(sum % i == 0){
                int width = i;
                int height = sum/i;
                if((width-2)*(height-2)==yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        return answer;
    }
}
