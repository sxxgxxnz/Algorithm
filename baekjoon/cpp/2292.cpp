#include <iostream>

using namespace std;

int main(){
    int num;
    cin >> num;
    int sum = 0;
    for(int i=2;i<=num;sum++){
        i += 6*sum;
    }
    if(num == 1) sum = 1;
    cout << sum ;
    return 0;
}