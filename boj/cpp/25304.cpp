#include <bits/stdc++.h>

using namespace std;

int main(){
    int total, cnt;
    int sum = 0;

    cin >> total >> cnt;

    for(int i=0;i<cnt+1;i++){
        // cnt가 마지막이 아닌경우
        if(i < cnt){
            int a,b;
            cin >> a >> b;
            sum += a * b;
        }
        // cnt가 마지막
        else{
            if(total == sum){
                cout << "Yes";
            }else{
                cout << "No";
            }
        }
        
    }
}
/*
    더 짧은 코드
    using namespace std;

    int main() {

        int x, t, a, b;

        cin >> x;
        cin >> t;

        for (int i = 0; i < t; i++) {
            cin >> a >> b;
            x -= a * b;
        }

        if (x == 0) cout << "Yes";
        else cout << "No";

        

        return 0;
    }
*/