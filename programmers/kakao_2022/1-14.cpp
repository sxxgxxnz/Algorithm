#include <string>
#include <vector>
#include <iostream>
#include <map>

using namespace std;

string solution(vector<string> survey, vector<int> choices) {
    string answer = "";
    map<char, int> surv ;

    for (int i=0;i<survey.size();i++){
        auto& surv_item = survey[i];
        auto& choice = choices[i];
        if(choice == 4){
            continue;
        }
        surv[surv_item.at(choice < 4 ? 0:1)] +=abs(choice -4);
    }
    if(surv['R']>=surv['T'])
        answer += 'R';
    else
        answer += 'T';
    if(surv['C'] >= surv['F'])
        answer += 'C';
    else
        answer +='F';
    if(surv['J'] >= surv['M'])
        answer += 'J';
    else
        answer +='M';
    if(surv['A'] >= surv['N'])
        answer += 'A';
    else
        answer +='N';
    return answer;
}

int main(void){
    vector<string> survey = {"AN","CF","MJ","RT","NA"};
    vector<int> choices = {5,3,2,7,5};
    string result = "TCMA";
    string answers = solution(survey,choices);
    if(result.compare(answers) == 0){
        cout << "success" << endl;
    }
    else{
        cout << "fail!" << endl ;
    }
    return 0;
}