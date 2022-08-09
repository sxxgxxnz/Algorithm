#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer;

    
    for(int i=0;i<commands.size();i++){
        vector<int> tmp;
        for(int j=commands[i][0]-1;j<commands[i][1];j++){
            tmp.push_back(array[j]);
        }
        sort(tmp.begin(),tmp.end());
        answer.push_back(tmp[commands[i][2]-1]);

    }

    return answer;
}

void print(vector<int> array,vector<vector<int>> commands,vector<int> answer){
    vector<int> p = solution(array,commands);
    if(p == answer)
        cout<< "success!";
    else
        cout << "fail!";

}

int main(void){
    vector<int> array = {1,5,2,6,3,7,4};
    vector<vector<int>> commands = {{2,5,3},{4,4,1},{1,7,3}};
    vector<int> answer = {5,6,3};
    //cout << solution(array,commands) ;
    print(array,commands,answer);
    return 0;
}