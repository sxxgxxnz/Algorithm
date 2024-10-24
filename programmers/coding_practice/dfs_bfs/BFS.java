package coding_practice.dfs_bfs;
import java.util.*;

public class BFS {
    static int[][] arr;
    public static void main(String[] args) {
        int n = 9;
        int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        System.out.println(solution(n,wires));
    }

    public static int solution(int n, int[][] wires){
        int answer = n;
        arr = new int[n+1][n+1];

        // 인접행렬에 input
        for(int i=0;i<wires.length;i++){
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }

        // 선을 하나씩 끊어보며 순회
        int a,b;
        for(int i=0;i<wires.length;i++){
            a=wires[i][0];
            b=wires[i][1];

            // 선을 하나 끊음
            arr[a][b] = 0;
            arr[b][a] = 0;

            // bfs
            //System.out.println("n : "+n+" a : "+a);
            answer = Math.min(answer,bfs(n,a));
            //System.out.println(answer);
            //선 복구
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        return answer;
    }

    public static int bfs(int n, int start){
        int[] visit = new int[n+1];
        int cnt = 1;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while(!queue.isEmpty()){
            int point = queue.poll();
            visit[point]=1;

            for(int i=1;i<=n;i++){ //point와 연결된 애들 중 방문한적 없으면 큐에 넣기
                if(visit[i]==1) continue;
                if(arr[point][i]==1){
                    queue.offer(i);
                    cnt++;
                }
            }
        }
        return (int)Math.abs(n-2*cnt);
    }
}
