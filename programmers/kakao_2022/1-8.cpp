#include <string>
#include <vector>
#include <set>
#include <map>
#include <sstream>
#include <iostream>

using namespace std;

vector<int> solution(vector<string> id_list, vector<string> report, int k) {
    vector<int> answer(id_list.size(),0);
    map<string,int> id_map; //각 이용자의 인덱스 저장
    map<string, set<string>> report_map; //신고자, 신고당한자 저장
    

    for(int i=0;i<id_list.size();++i){   //각 이용자의 인덱스를 맵에 저장
        //cout << id_list[i] << " ;;; ";
        id_map[id_list[i]] = i ;
        //cout << id_map[id_list[i]] << " ;; ";
    }
     for(auto iter : id_map){
        cout << " id_map : " <<iter.first<< " :::: " << iter.second ;
    } 
    
    for(auto rep:report){
        //문자열 파싱
        stringstream ss(rep);
        string from, to;
        ss >> from >> to;

        report_map[to].insert(from);
    }

    for(auto iter : report_map){
        if(iter.second.size() >= k){
            for(auto in_iter : iter.second){
                answer[id_map[in_iter]]++;
            }
        }
    }

    return answer;
}

void print(vector<string> id_list,vector<string> report,int k,vector<int> result){
    vector<int> f = solution(id_list,report,k);
    if(f == result){
        cout << "success";
    }
    else{
        for(int i=0;i<f.size();i++){
            cout << f[i] << " ;   ";
        }
        cout << "fail";
    }
}
int main(void){
    vector<string> id_list = {"muzi", "frodo","apeach","neo"};
    vector<string> report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
    int k = 2;
    vector<int> result = {2,1,1,0};
    print(id_list,report,k,result);
    return 0;
}