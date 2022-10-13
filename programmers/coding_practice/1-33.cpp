#include <string>
#include <vector>
#include <iostream>

using namespace std;

string solution(string phone_number) {
    string answer = "";
    for(int i=0;i<phone_number.size()-4;i++){
       answer+="*";
    }
    phone_number.replace(0,phone_number.size()-4,answer);
    return phone_number;
}

int main(){
    string result = solution("027778888");
    if(result == "*****8888"){
        cout << "success!"<<endl;
    }
    else{
        cout << "fail!" << endl;
        cout << result << endl;
    }
}