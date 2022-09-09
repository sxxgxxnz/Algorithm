#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;

    for(int i=0;i<n;i++){
        string tmp = "";
        arr1[i] = arr1[i] | arr2[i];

        while(tmp.size()!=n){
            if(arr1[i] % 2 == 0){
                tmp.push_back(' ');

            }
            else{
                tmp.push_back('#');
            }
            arr1[i] /= 2;
        }
        reverse(tmp.begin(),tmp.end());
        answer.push_back(tmp);
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