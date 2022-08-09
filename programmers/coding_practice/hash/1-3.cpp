#include <vector>
#include <set>
#include <iostream>

using namespace std;

int solution(vector<int> nums)
{
    int answer = 0;
    
    set<int> tmp; // 중복값을 허용하지 않음
    
    for(auto i:nums){
        tmp.insert(nums[i]);
    }

    //set의 크기가 값
    if(tmp.size() <= nums.size()/2){
        answer = tmp.size();
    }
    else{
        answer = nums.size()/2;
    }
    return answer;
}

int main(void){
    vector<int> nums = {3,1,2,3};
    cout << solution(nums);
    return 0;
}