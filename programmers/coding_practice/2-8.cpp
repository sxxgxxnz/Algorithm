#include <string>
#include <vector>
#include <iostream>

using namespace std;

// 해당 숫자의 2진법 1의 자리 숫자 반환함수
int func(int n){
    int cnt = 0;
    string str = "";
    int div = n;
    while(1){
        int res = div%2;
        div/=2;
        str=to_string(res)+str;
        if(div<2){
            str=to_string(div) + str;
            break;
        }
    }

    for(char c:str){
        if( c == '1'){
            cnt++;
        }
    }
    return cnt;
}
int solution(int n) {
    int answer = 0;
    int x = func(n);
    while(1){
        n++;
        if(func(n)==x){
            answer = n;
            break;
        }
    }
    return answer;
}

int main(){
    int num=78;
    int result = 83;
    if(solution(num)==result){
        cout << "success!" <<endl;
    }else{
        cout << "fail!" << endl;
    }
    return 0;
}