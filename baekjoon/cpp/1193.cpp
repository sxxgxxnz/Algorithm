#include <iostream>

using namespace std;

int main(){
    int num;

    cin >> num;

    int i = 1;
    while (num > i){
        num -= i;
        i++;
    }

    if(i % 2 == 1){
        cout << i + 1 - num << "/" << num;
    }
    else{
        cout << num << "/" << i + 1 - num;
    }
}