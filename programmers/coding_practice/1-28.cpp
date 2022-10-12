#include <string>
#include <vector>

using namespace std;
/*
vector<long long> solution(int x, int n) {
    vector<long long> answer;
    int tmp=x;
    for(int i=1;i<=n;i++){
        answer.push_back(x);
        x+=tmp;
    }
    return answer;
}
*/
vector<long long> solution(int x, int n) {
    vector<long long> answer;
    
    for(int i=1;i<=n;i++){
        answer.push_back(x*i);
    }
    return answer;
}