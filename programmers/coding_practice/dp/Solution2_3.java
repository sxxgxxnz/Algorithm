//package dp;

class Solution2_3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 40;
        int n = 5;
        System.out.println(solution(x,y,n));
    }
    public static int solution(int x, int y, int n) {
        
        int[] dp = new int[y+1];

        for(int i=x;i<=y;i++){
            if(i!=x && dp[i]==0){
                dp[i] = -1;
                continue;
            }

            if(i+n <= y){
                dp[i+n] = (dp[i+n] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1,dp[i+n]);
            }

            if(i*2 <=y) {
                dp[i*2] = (dp[i*2] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i*2]);
            }

            if(i*3 <= y){
                dp[i*3] = (dp[i*3] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i*3]);
            }
        }
        return dp[y];
    }
}
