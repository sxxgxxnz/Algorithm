#include <bits/stdc++.h>

using namespace std;

int main(){
    int n,v;
    int arr[101];

    cin >> n;
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    cin >> v;

    int res = 0;
    for(int i=0;i<n;i++){
        if(arr[i]==v) res++;
    }

    cout << res;
}