#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main(){
    string str;
    getline(cin,str);

    int cnt = 0;
    bool flag = true;

    for(int i=0;i<str.length();i++){
        if(str[i] == ' '){
            flag = true;
            
        }else if(flag){
            flag = false;
            cnt++;
        }
    }
    cout << cnt << endl;
    return 0;
}