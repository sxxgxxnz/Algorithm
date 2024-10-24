package coding_practice.dfs_bfs;
public class DFS2 {
    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes){
       // int answer = 0;
        int maxV = 0; // 가로
        int maxH = 0; // 세로
        for(int i=0;i<sizes.length;i++){
            int v = Math.max(sizes[i][0],sizes[i][1]);
            int h = Math.min(sizes[i][0],sizes[i][1]);
            maxV=Math.max(maxV,v);
            maxH=Math.max(maxH,h);
        }
        return maxV*maxH;
    }
}
