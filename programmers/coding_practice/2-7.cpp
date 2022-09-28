#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int n) {
    int answer = 0;
    int f[100001];
    f[0] = 0;
    f[1] = 1;

    for(int i=2;i<=n;i++){
        f[i] = (f[i-1] + f[i-2]) % 1234567;
    }
    answer = f[n];
    return answer;
}

int main(){
    int num=3;
    int result = 2;
    if(solution(num)==result){
        cout << "success!" <<endl;
    }else{
        cout << "fail!" << endl;
    }
    return 0;
}