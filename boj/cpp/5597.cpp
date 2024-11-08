#include <bits/stdc++.h>

using namespace std;

int main(){
    int n;
    bool arr[31] = {0,};
    for(int i=0;i<28;i++){
        cin >> n ;
        arr[n]=1; 
    }
    for(int j=1;j<=30;j++){
        if(!arr[j]){
            cout << j << '\n';
        }
    }
}