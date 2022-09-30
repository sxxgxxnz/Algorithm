#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(vector<int> people, int limit) {
    int answer = 0,idx = 0;
    sort(people.begin(),people.end());
    while(people.size() > idx){
        int back = people.back();
        people.pop_back();
        if(people[idx]+back<=limit){
            answer++;
            idx++;
        }
        else{
            answer++;
        }
    }
    return answer;
}

int main(){
    int result = solution({70,50,80,50},100);
    if(result == 3){
        cout << "success!" << endl;
    }
    else{
        cout << "fail!" << endl;
    }
}