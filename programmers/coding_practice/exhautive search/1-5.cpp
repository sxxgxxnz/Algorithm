#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    vector<vector<int>> math = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
    vector<int> cnt = {0,0,0};
    for(int i=0;i<answers.size();i++){
        if(answers[i] == math[0][i % math[0].size()])
            cnt[0]++;
        if(answers[i] == math[1][i % math[1].size()])
            cnt[1]++;
        if(answers[i] == math[2][i % math[2].size()])
            cnt[2]++;
    }
    //가장 많이 맞춘 수포자 찾기
    int max = *max_element(cnt.begin(),cnt.end());
    // 만약 가장 많이 맞춘 수포자가 여럿일 경우
    for(int i=0;i<3;i++){
        if(max == cnt[i])
            answer.push_back(i+1);
    }
    return answer;
}

void print(vector<int> answers,vector<int> answer){
    vector<int> r = solution(answers);
    if(r == answer){
        cout << "success!";
    }
    else{
        cout << "fail!";
    }
}

int main(void){
    vector<int> answers = {1,2,3,4,5};
    vector<int> answer = {1};
    print(answers,answer);
    return 0;
}