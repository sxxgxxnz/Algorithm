#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> lottos, vector<int> win_nums) {
    vector<int> answer;
    int cnt = 0;
    int cnt_zero = 0;
    for(int i=0;i<lottos.size();i++){
        for(int j=0;j<win_nums.size();j++){
            if(lottos[i] == win_nums[j]){
                cnt++;
                win_nums.erase(win_nums.begin()+j);
            }
        }
        if (lottos[i] == 0)
        {
            cnt_zero++;
            continue;
        }
    }
    int min,max;
    int win_cnt = cnt + cnt_zero;
    if(cnt<2){
        min = 6;
    }
    else{
        min = 6-cnt+1;
    }
    
    if(win_cnt < 2){
        max = 6;
    }
    else{
        max = 6 - win_cnt + 1;
    }
    answer.push_back(max);
    answer.push_back(min);
    
    return answer;
}

void print(vector<int> lottos, vector<int> win_nums,vector<int> result){
    vector<int> vv = solution(lottos,win_nums);
    if(vv == result){
        cout << "success";
    }
    else{
        for (int i = 0; i < vv.size(); i++)
        {
            cout << vv[i] << endl;
        }
        cout << "fail";
    }
}
int main(void){
    vector<int> lottos = {44,1,0,0,31,25};
    vector<int> win_nums = {31,10,45,1,6,19};
    vector<int> result = {3,5};
    print(lottos,win_nums,result);
    return 0;
}