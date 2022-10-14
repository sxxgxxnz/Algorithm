//멀리뛰기 -> 피보나치 개념
#include <string>
#include <vector>

using namespace std;

long long solution(int n) {
    long long answer = 0;
    vector<long long> dp (n+1,0);
    dp[1]=1;
    dp[2]=2;
    for(int i=3;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
        dp[i]=dp[i]%1234567;
    }
    return dp[n] % 1234567;
}