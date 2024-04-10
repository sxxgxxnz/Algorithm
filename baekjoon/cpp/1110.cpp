#include <iostream>

using namespace std;

int main(){
    int n;
    cin >> n ;
    int init = n;
    int cnt = 0;

    do{
        n = (n % 10) * 10 + ((n % 10) + (n / 10)) % 10;

        cnt++;

    }while(n!=init);

    cout << cnt << endl;
    return 0;
}