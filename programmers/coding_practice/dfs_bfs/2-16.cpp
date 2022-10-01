#include <string>
#include <vector>
#include <iostream>

//dfs
using namespace std;

int answer = 0;

void getTargetNum(vector<int> numbers,int target,int sum,int index){
    //종료조건
    if(index == numbers.size()){
        if(sum == target){
            answer ++;
        }
        // target값이 아니면 리턴
        return;
    }
    
    getTargetNum(numbers,target,sum+numbers[index],index+1);
    getTargetNum(numbers,target,sum-numbers[index],index+1);

}
int solution(vector<int> numbers, int target) {
    getTargetNum(numbers,target,0,0);
    return answer;
}

int main(){
    int result = solution({1,1,1,1,1},3);
    if(result == 5){
        cout << "success!" << endl;
    }
    else{
        cout << result << endl << "fail!" << endl;
    }
}