//package s:w coding_2018;

public class Solution2_2 {
    static int[] dy = {-1,0,1,0};
    static int[] dx = {0,1,0,-1};
    // 방문 길이
    public static void main(String[] args) {
        String dirs = "ULURRDLLU";
        
        System.out.println(solution(dirs));
    }

    public static int solution(String dirs){
        // 0 : 상
        // 1 : 우
        // 2 : 하
        // 3 : 좌
        //[y축][x축][방향]
        boolean[][][] visited = new boolean[11][11][4]; 
        int y = 5;
        int x = 5;
        int d = 0;

        int answer = 0;

        for(char c : dirs.toCharArray()){
            if(c == 'U') d = 0;
            if(c == 'R') d = 1;
            if(c == 'D') d = 2;
            if(c == 'L') d = 3;

            int ny = y + dy[d];
            int nx = x + dx[d];
            if(ny < 0 || ny >= 11 || nx < 0 || nx >= 11) continue;
            if(!visited[ny][nx][d]){
                visited[ny][nx][d] = true;
                visited[y][x][(d + 2) % 4] = true;
                System.out.println((d+2)%4);
                answer++;
            }
            y = ny;
            x = nx;
        }
        return answer;
    }
}
