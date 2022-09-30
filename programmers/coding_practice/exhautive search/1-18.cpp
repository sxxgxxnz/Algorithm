#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

int solution(vector<vector<int>> sizes) {
    int left = 0;
    int right = 0;
    for(int i=0;i<sizes.size();i++){
        left = max(left,max(sizes[i][0],sizes[i][1]));
        right = max(right,min(sizes[i][0],sizes[i][1]));
    }
    return left * right;
}
int main(){
    int result = solution({{60,50},{30,70},{60,30},{80,40}});
    if(result == 4000){
        cout << "success!" << endl;
    }
    else{
        cout << "fail!" << endl;
    }
}