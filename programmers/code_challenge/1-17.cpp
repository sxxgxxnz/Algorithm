#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(string s) {
    vector<int> answer;
    return answer;
}

void print(string s, vector<int> result){
    vector<int> vec = solution(s);
    if(vec == result){
        cout << "success!" << endl;
    }
    else{
        for(int i=0;i<vec.size();i++){
            cout << vec[i] << " ;;;; " << endl;
        }
        cout << "fail!" << endl;
    }
}
int main(){
    string s = "01110";
    vector<int> result = {3,3};
    print(s,result);
    return 0;
}