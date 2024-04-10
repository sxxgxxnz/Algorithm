#include <string>
#include <iostream>


using namespace std;

int main(){
    string str;
    int time = 0;
    int arr[26] = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
    
    cin >> str;

    for(int i=0;i<str.size();i++){
        int idx = str[i]-65;
        time += arr[idx];
    }

    cout << time << endl;

    return 0;
}