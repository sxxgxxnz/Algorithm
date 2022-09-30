#include <iostream>
#include <string>
#include <stack>

using namespace std;

int solution(string s)
{
    stack<char> stk;
    for(const auto& c : s){
        if(!stk.empty()){
            if(stk.top() == c)
                stk.pop();
            else stk.push(c);
        }
        else{
            stk.push(c);
        }
    }
    return stk.empty() ? 1 : 0;
}

int main(){
    int result = solution("baabaa");
    if(result == 1){
        cout << "success!" << endl;
    }
    else{
        cout << result << endl;
        cout << "fail!" << endl;
    }
    
    return 0;

}