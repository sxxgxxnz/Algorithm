#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
 
using namespace std;

bool compare(pair<double, int> &a,pair<double,int> &b){
    if(a.first == b.first) return a.second < b.second;
    else return a.first > b.first ;
}
int cnt[501];
vector<pair<double,int>> fail;

vector<int> solution(int N, vector<int> stages) {
    vector<int> answer;
    
    for(int i=0;i<stages.size();i++){ // 각 stage에 실패한 사람들 count
        cnt[stages[i]]++;
    }

    int allUser = stages.size();
    
    for(int i=1;i<=N;i++){
        if(!stages.size() || cnt[i] == 0)
            fail.push_back({0,i}); //stage에서 실패한 사람이 없다면 실패율은 0
        else{
            double t = (double) cnt[i] / allUser;
            fail.push_back({t,i});
        }
        allUser -= cnt[i];
    }
    
    sort(fail.begin(), fail.end(), compare);

    for(int i=0;i<fail.size();i++){
        auto tmp = fail[i];
        answer.push_back(tmp.second);
    }
    return answer;
}
void print(vector<int> answers,vector<int> a,int N){
    vector<int> tt = solution(N,a);
    if(tt == answers){
        cout << "success";
    }
    else{
        for(int i=0;i<tt.size();i++){
            cout << tt[i] << ";  ";
        }
        cout << "fail";
    }
}
int main(void){
    vector<int> aa = {2,1,2,6,2,4,3,3};
    vector<int> answers = {3,4,2,1,5};
    //int N = 5;

    print(answers,aa,5);

    return 0;

}