#include <string>
#include <vector>
#include <iostream>
#include <stack>

using namespace std;

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    stack<char> str;

    for(int i=0;i<n;i++){
        //string tmp = "";
        arr1[i] = arr1[i] | arr2[i];

        for(int j=0;j<n;j++){
            if(arr1[i] % 2 == 0){
                str.push(' ');

            }
            else{
                str.push('#');
            }
            arr1[i] /= 2;
        }

        answer.push_back("");
        while(!str.empty()){
            answer[i].push_back(str.top());
            str.pop();
        }
    }
    return answer;
}


int main(){
    int n = 5;
    vector<int> arr1 = {9,20,28,18,11};
    vector<int> arr2 = {30,1,21,17,28};
   // vector<string> result = {"#####","# # #","### #","# ##","#####"};  
    vector<string> answers = solution(n,arr1,arr2);

    for(int i=0;i<answers.size();i++){
        cout << answers[i] << endl;
    }
    return 0;
}