#include <string>
#include <vector>
#include <iostream>
#include <map>

using namespace std;

vector<int> solution(int n, vector<string> words) {
    vector<int> answer;
    map<string,int> turn;
    turn[words[0]]++;
    for(int i=1;i<words.size();i++){
        if(turn[words[i]] || words[i].front() != words[i-1].back()) 
            return {(i%n)+1,(i/n)+1};
        turn[words[i]]++;
    }    

    return {0,0};
}
void print(int n,vector<string> word,vector<int> result){
    vector<int> v = solution(n,word);
    if(result == v){
        cout << "success!" << endl;
    }
    else{
        cout << "fail!" << endl;
    }
}
int main(){
    print(3,{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"},{3,3});
    return 0;
}