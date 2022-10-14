#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr, int divisor) {
    vector<int> answer;
    for(int i=0;i<arr.size();i++){
        if(arr[i] % divisor == 0){
            answer.push_back(arr[i]);
        }
        if(i==arr.size()&&answer.empty()){
            answer.push_back(-1);
        }
    }
    sort(answer.begin(),answer.end());
    return answer;
}

void print(vector<int> arr,int divisor,vector<int> result){
    vector<int> answer = solution(arr,divisor);
    if(answer == result){
        cout << "success!" << endl;
    }
    else{
        cout << "fail!" << endl;
        for(int i=0;i<answer.size();i++){
            cout << answer[i] << endl;
        }
    }
}
int main(){
    print({5,9,7,10},5,{5,10});
}