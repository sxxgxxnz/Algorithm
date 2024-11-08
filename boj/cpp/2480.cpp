#include <bits/stdc++.h>
//#include <algorithm>

using namespace std;

int main(){
    int a,b,c;
    cin >> a >> b >> c;

    // 3개 모두 다른 경우
    if(a != b && b != c && c != a){
        //a가 제일 큰 경우
        int tmp;
        tmp = max({a,b,c});
        cout << tmp * 100;
    }
    //3개 모두 같은 경우
    else if(a==b && b==c){
        cout << 10000 + a * 1000;
    }
    //a와 b만 같은 경우
    else if(a==b && b!=c){
        cout << 1000 + a * 100;
    }
    //b와 c만 같은 경우
    else if(a!=b && b==c){
        cout << 1000 + b * 100;
    }
    //a와 c만 같은 경우
    else if(a==c && c!=b){
        cout << 1000 + c * 100 ;
    }
 
}
