#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> A, vector<int> B)
{
    int answer = 0;
    sort(A.begin(),A.end()); // a 배열 오름차순
    sort(B.begin(),B.end(),greater<>()); //b 배열 내림차순

    for(int i=0;i<A.size();i++){
        answer += A[i] * B[i]; 
    }
    return answer;
}

int main(){
    vector<int> a={1,4,2};
    vector<int> b={5,4,4};
    int result = 29;
    int answer = solution(a,b);
    if(result == answer){
        cout << "success!" << endl;
    }
    else{
        cout << "fail!" << endl;
    }
    return 0;
}