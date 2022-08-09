#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>

using namespace std;
using std::string;

string solution(vector<string> participant, vector<string> completion) {
    string answer = "";

    unordered_map<string,int> tmp ;
    //참가자를 맵에 넣는다
    //없는 참가자는 키,값을 쌍으로 삽입하고
    //있는 참가자인 경우 값만 연산한다.
    for(auto p:participant){
        if(tmp.find(p) == tmp.end()){
            tmp.insert(make_pair(p,1));
        }
        else{
            tmp[p]++;
        }
        
    }
    
    //완주자는 맵에서 제거한다.
    for(auto p : completion){
        tmp[p]--;
    }

    //value가 1인 참가자를 찾는다.
    for(auto p : participant){
        if(tmp[p] > 0){
            answer = p;
            break;
        }
    }
    return answer;
}

int main(void){
    vector<string> part = {"leo","kiki","eden"};
    vector<string> comp = {"eden","kiki"};
    cout << solution(part,comp);
    
    return 0;
}