#include <iostream>
#include <vector>
#include <string>


using namespace std;

string solution(string new_id) {
    string answer = "";
    
    //1단계 : 모든 대문자를 대응되는 소문자로 치환합니다.
    for(int i=0;i<new_id.length();i++){
        if(new_id[i] >= 'A' && new_id[i] <= 'Z')
            new_id[i] = tolower(new_id[i]);
    }
    
    //2단계 : 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    for(int i=0;i<new_id.length();i++){
        if((new_id[i] >= 'a' && new_id[i] <= 'z') || (new_id[i] >='0' && new_id[i] <= '9') || new_id[i] == '-' || new_id[i] == '_' || new_id[i] == '.')
            answer.push_back(new_id[i]);
    }
    
    //3단계 : 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
    int i=1;
    while(i < answer.length()){
        if(answer[i-1] == '.' && answer[i] == '.'){
            answer.erase(answer.begin() + i);
            continue;
        }
        i++;
        
    }
    
    //4단계 : 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
    if(answer[0] == '.'){
        answer.erase(answer.begin());
    }
    if(answer[answer.length()-1] == '.'){
        answer.erase(answer.end() -1);
    }
    
    //5단계 : 빈 문자열이라면, new_id에 'a'를 대입한다.
    if(answer.length()==0){
        answer.push_back('a');
    }
    
    //6단계 : 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다. 
    //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
    if(answer.length() >= 16){
        answer.erase(answer.begin()+15,answer.end());
        if(answer[answer.length() - 1] == '.'){
            answer.erase(answer.end() - 1);
        }
    }
    
    //7단계 : new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
    if(answer.length() <= 2){
        while(answer.length() != 3)
            answer.push_back(answer[answer.length() - 1]);
    }
    return answer;
}

