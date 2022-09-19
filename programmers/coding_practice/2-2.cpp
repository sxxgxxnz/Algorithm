#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

string solution(string s) {
    //string answer = "";
    
    for(int i=0;i<s.size();i++){
        if((isalpha(s[i]) && s[i-1] == ' ') || (isalpha(s[i]) && i == 0)){
            s[i] = toupper(s[i]);
        }else{
            s[i] = tolower(s[i]);
        }
    }
   
    return s;
}

int main(){
    string s = "3people unFollowed me";
    cout << solution(s) << endl;
    return 0;
}