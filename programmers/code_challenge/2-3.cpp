#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(string s) {
    vector<int> answer(2,0);
    int cntBin = 0; // 이진변환 횟수
    int cntZero = 0;    // 제거한 0의 개수

    while (s != "1"){
        int tmp = 0; 
        for(int i=0;i<s.length();i++){
            if(s[i] == '1'){
                tmp ++;
            }
        }
        cntZero += s.length() - tmp;

        s = "";
        while(tmp > 0){ // 이진변환
            s+=to_string(tmp%2);
            tmp /=2;
        }
        cntBin ++;

    }

    answer[0] = cntBin;
    answer[1] = cntZero;
    return answer;
}
void print(string str, vector<int> result){
    vector<int> vv=solution(str);
    if(vv == result){
        cout << "success!" << endl;
    }
    else{
        cout << "fail!" << endl;
    }
}
int main(){
    string str = "01110";
    vector<int> result = {3,3};
    print(str,result);
    
    return 0;

}