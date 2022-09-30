#include <string>
#include <vector>
#include <iostream>

using namespace std;

int gcd(int x,int y){ return x % y == 0 ? y : gcd(y,x%y); } //최소공배수
int lcm(int x,int y) { return x * y / gcd(x,y); } // 최대공약수
int solution(vector<int> arr) {
    int answer = arr[0];
    for(int i=1;i<arr.size();i++){
        answer = lcm(answer,arr[i]);
    }
    return answer;
}

int main(){
    int result = solution({2,6,8,14});
    if(result == 168){
        cout << "success!" << endl;
    }
    else{
        cout << result << endl << "fail!" << endl;
    }
}