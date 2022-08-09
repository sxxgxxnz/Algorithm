#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
    int answer = 0;
    vector<int> student (n+2);

    for(int i:lost){
        student[i]--;
    }
    for(int i:reserve){
        student[i]++;
    }

    for(int i=1;i<=n;i++){
        if(student[i]<0){//도난 당한 경우
            if(student[i-1] == 1 ){ //앞 번호 학생이 여분의 체육복이 있는 경우
                student[i]++;
                student[i-1]--;
            }
            else if(student[i+1] == 1){// 뒷 번호 학생이 여분의 체육복이 있는 경우
                student[i]++;
                student[i+1]--;
            }
        }
    }
    for(int i=0;i<n;i++){
        if(student[i]>=0){  //체육복이 있는 학생
            answer++;
        }
    }
    return answer;
}

void print(int n,vector<int> lost, vector<int> reserve,int answers){
    int a = solution(n,lost,reserve);
    if(a == answers){
        cout << "success!";
    }
    else{
        cout << "fail!";
    }
}
int main(void){
    int n = 5;
    vector<int> lost = {2,4};
    vector<int> reserve = {1,3,5};
    int answers = 5;

    print(n,lost,reserve,answers);

    return 0;
}