#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{
    bool answer = true;
    int p=0,y=0;
    for(int i=0;i<s.size();i++){
        s[i]=tolower(s[i]);
        if(s[i] == 'p'){
            p++;
        }else if(s[i] == 'y'){
            y++;
        }
    }
    if(p!=y){
        answer=false;
    }
    return answer;
}