#include <string>
#include <vector>
#include <iostream>

using namespace std;

long long solution(int a, int b) { //시그마공식
    return (long long)(a+b)*(abs(a-b)+1)/2;
}

int main(){
    long long result = solution(3,5);
    if(result == 12){
        cout << "success!" <<endl;
    }
    else{
        cout << "fail!" << endl;
    }
}