#include <bits/stdc++.h>

using namespace std;

int n, m;
int arr[101] = {0, };
int a,b;

void swap(int idx1, int idx2){
    int tmp = arr[idx1];
    arr[idx1]=arr[idx2];
    arr[idx2]=tmp;
}

int main(){
    cin >> n >> m;

    for(int i=1;i<=n;i++){
        arr[i]=i;
    }
    //cout << arr ;

    for(int i=0;i<m;i++){
        cin >> a >> b;
        swap(a,b);
    }
    
    for(int i=1;i<=n;i++){
        cout << arr[i] << " ";
    }
}
