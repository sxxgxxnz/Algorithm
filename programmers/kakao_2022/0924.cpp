#include <string>
#include <vector>
#include <iostream>
#include <map>
#include <sstream>

using namespace std;

vector<string> solution(vector<string> commands) {
    vector<string> answer;
    
    vector<pair<string,string>> v;
    string str_buf;

    for(int i=0;i<commands.size();i++){
        string str=commands[i];
        istringstream iss(str);
        vector<string> x;
        while(getline(iss,str_buf,' ')){
            x.push_back(str_buf);
        }

        string cmd = x.front(); //커멘드 저장
        if(atoi(x[1].c_str()) == 0){ // 문자
                string v1 = x[1];
                string v2 = x[2];
                replace(v.begin(),v.end(),x[1],x[2]);
        }
        else{ //숫자
            if(cmd.compare("UPDATE")){
                string xy = x[1] + x[2];
                string value = x[3];
                v.push_back(pair(xy,value));
            }else if(cmd.compare("MERGE")){
                string rc1 = x[1]+x[2];
                string rc2 = x[3]+x[4];
                auto it = find_if(v.begin(),v.end(),[&rc1](const pair<string,string>& elem){ return elem.first == rc1;});
                auto it2 = find_if(v.begin(),v.end(),[&rc2](const pair<string,string>& elem){ return elem.first == rc2;});
                //string mrg = it + it2;
                replace(v.begin(),v.end(),(string)it,(string)it+it2);
            }else if(cmd.compare("UNMERGE")){

            }else { //print

            }
               
            }
    }
    return answer;
}
void print(vector<string> command, vector<string> result){
    vector<string> vv = solution(command);
    if(vv == result){
        cout << "success!" <<endl;
    }
    else{
        cout << "fail!" << endl;
    }
}
int main(){
    vector<string> command = {"update 1 1 a","update 1 2 b","update 2 1 c","update 2 2 d","merge 1 1 1 2","merge 2 2 2 1","merge 2 1 1 1","pring 1 1","unmerge 2 2","print 1 1"};
    vector<string> result = {"d","empty"};
    print(command,result);
    return 0;
}