#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int n) {
    int answer = 0;

    for(int i=1;i<n;i++){
        if(n%i == 1){
            answer = i;
            break;
        }
    }
    return answer;
}

int main(){
    int result = solution(10);
    if(result == 3){
        cout << "success!" << endl;
    }
    else{
        cout << "fail!" << endl;
        cout << result << endl;
    }
}