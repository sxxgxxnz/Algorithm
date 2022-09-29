#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(int brown, int yellow) {
    vector<int> answer;
    int width, height;

    int sum = brown+yellow;
    for(int i=sum/2;i>0;i--){
        if(sum % i == 0){
            int width = i;
            int height = sum/i;
            if((width-2)*(height-2)==yellow){
                answer.push_back(width);
                answer.push_back(height);
                break;
            }
        }
    }
    return answer;
}
void print(int brown, int yellow, vector<int> result){
    vector<int> v = solution(brown,yellow);
    if(v==result){
        cout << "success!" << endl;
    }
    else {
        cout << "fail!" << endl;
    }
}
int main(){
    print(10,2,{4,3});
    print(8,1,{3,3});
    print(24,24,{8,6});
    return 0;
}