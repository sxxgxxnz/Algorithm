package coding_practice.dfs_bfs;
import java.util.*;

public class DFS {
    //프로그래머스 - 소수찾기
    static Set<Integer> set;
    static boolean[] visited = new boolean[7];
    public static void main(String[] args) {
        System.out.println(solution("17"));
    }
    
    public static int solution(String numbers){
        int answer = 0;
        set = new HashSet<>();
        dfs(numbers,"",0);

        for(Integer num : set){
            if(isPrime(num)){
                answer++;
            }
        }
        return answer;
    }

    public static void dfs(String numbers,String s,int depth){
        //numbers의 끝까지 다 탐색했을 경우 종료
        if(depth > numbers.length()){
            return;
        }

        for(int i=0;i<numbers.length();i++){
            if(!visited[i]){
                visited[i] = true;
                set.add(Integer.parseInt(s + numbers.charAt(i)));
                dfs(numbers,s + numbers.charAt(i),depth+1);
                visited[i]=false;
            }
        }
    }
    
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        //에라토스테네스 체 -> 소수 찾기
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                
                return false;
            }
        }
        
        return true;
    }
}
