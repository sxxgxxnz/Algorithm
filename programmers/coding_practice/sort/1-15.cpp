#include <string>
#include <vector>
#include <iostream>
#include <sstream>

using namespace std;

string solution(string s) {
    string answer = "";
    string tmp;
    vector<int> vec;
    for(int i=0;i<s.size();i++){
        if(s[i] == ' '){
            vec.push_back(atoi(tmp.c_str())); 
            tmp.clear();
        }
        else{
            tmp += s[i];
        }
    }
    vec.push_back(atoi(tmp.c_str()));
    sort(vec.begin(),vec.end(),greater<int>());
    answer += to_string(vec.back()) + " " + to_string(vec.front());
    return answer;
}



int main(){
    string s = "1 2 3 4";
    string result = "1 4";

    cout << solution(s) << endl;
    
    return 0;

}