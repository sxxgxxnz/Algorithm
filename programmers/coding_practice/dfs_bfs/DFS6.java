package coding_practice.dfs_bfs;
import java.util.*;

public class DFS6 {
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        System.out.println(Arrays.toString(solution(tickets)));
    }
    
    static boolean[] visited;
    static ArrayList<String> list = new ArrayList<>();

    public static String[] solution(String[][] tickets){
        visited = new boolean[tickets.length];

        dfs(0,"ICN","ICN",tickets);

        Collections.sort(list);

        return list.get(0).split(" ");
    }

    public static void dfs(int depth, String now, String path, String[][] tickets){
        if(depth == tickets.length){
            list.add(path);
            return;
        }

        for(int i=0;i<visited.length;i++){
            if(!visited[i] && now.equals(tickets[i][0])){
                visited[i] = true;
                dfs(depth+1, tickets[i][1],path +" "+tickets[i][1],tickets);
                visited[i]=false;
            }
        }
    }
}
