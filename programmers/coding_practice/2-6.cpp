#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int n) {
    int answer = 1;

    for(int i=1;i<n;i++){
        int sum=i;
        for(int j=i+1;j<n;j++){
            sum+=j;
            if(sum==n){
                answer++;
            }else if(sum>n){
                break;
            }
        }
    }

    return answer;
}

int main(){
    int num=15;
    int result = 4;
    if(solution(num)==result){
        cout << "success!" <<endl;
    }else{
        cout << "fail!" << endl;
    }
    return 0;
}