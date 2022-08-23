#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    answer.push_back(arr[0]);
    for(int i=1;i<arr.size();i++){
        if(arr[i-1] != arr[i]){
            answer.push_back(arr[i]);
        }
    }
    return answer;
}

void print(vector<int> arr, vector<int> result){
    vector<int> vv = solution(arr);
    if(vv == result){
        cout << "success";
    }
    else{
        for(int i=0;i<vv.size();i++){
            cout << vv[i] << ";;; " << endl;
        }
        cout << "fail";
    }
}
int main(void){
    vector<int> arr ={1,1,3,3,0,1,1};
    vector<int> result = {1,3,0,1};
    print(arr,result);
    return 0;
}