#include <string>
#include <vector>
#include <queue>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer;
    queue<int> q;
    
    for(int i=0;i<progresses.size();i++){
        int day = (100-progresses[i])/speeds[i] + ((100-progresses[i]) % speeds[i] != 0);
        q.push(day);
    }
    while(!q.empty()){
        int now = q.front();
        q.pop();
        if(q.empty()){
            answer.push_back(1);
            break;
        }
        int cnt = 1;
        while (q.front() <= now)
        {
            q.pop();
            cnt++;
            if(q.empty()) break;
        }
        answer.push_back(cnt);
        
    }
    return answer;
}
void print(vector<int> prg, vector<int> spd,vector<int> result){
    vector<int> vec = solution(prg,spd);
    if(vec==result){
        cout << "success!" << endl;
    }
    else{
        cout << "fail!" << endl;
    }
}
int main(){
    print({93,30,55},{1,30,5},{2,1});
}