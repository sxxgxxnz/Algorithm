
/*
//숫자 펠린드롬
n=1, m=100 , result = 18
#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int n,int m){
    int answer = 0;
    for(int i=n;i<=m;i++){
        string str = to_string(i);
        string tmp = str;
        reverse(str.begin(),str.end());
        if(str.compare(tmp) == 0){
            answer++;
        }
    }
    return answer;
}
int main(){
    int result = solution(1,100);
    if(result == 18){
        cout << "success!" << endl;
    }else{
        cout << "fail!" <<endl;
    }
    return 0;
}
/////////////////////////////////////////////////
//직사각형
{{1,4},{3,4},{3,10}}
result = {1,10}
#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<vector<int>> v){
    vector<int> ans;
    ans.push_back(v[0][0] ^ v[1][0] ^ v[2][0]);
    ans.push_back(v[0][1] ^ v[1][1] ^ v[2][1]);
    return ans;
}
void print(vector<vector<int>> v,vector<int> result){
    vector<int> vecc=solution(v);
    if(vecc==result){
        cout << "success" << endl;

    }
    else{
        cout << "fail!" << endl;
    }
}
int main(){
    vector<vector<int>> vec={{1,4},{3,4},{3,10}};
    vector<int> result = {1,10};
    print(vec,result);
    return 0;
}
/////////////////////////////////////////////////
//n의 자릿수 합
n = 123
answer = 6
#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int n){
    int answer = 0;

    while (n > 0){
        answer+=n % 10;
        n/=10;
    }
    return answer;
}

int main(){
    int result = solution(123);
    if(result == 6){
        cout << "success!" << endl;

    }
    else{
        cout << "fail!" << endl;
    }
    return 0;
}
////////////////////////////////////////////////
//주어진 숫자중 3개를 더해서 소수가 되는 경우의 개수
nums=1,2,3,4
result = 1(1+2+4)=7

#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(vector<int> nums){
    int answer = 0;
    vector<int> tmp;
    //sort(nums.begin(),nums.end());

    for(int i=0;i<nums.size();i++){
        for(int j=i+1;j<nums.size();j++){
            for(int k=j+1;k<nums.size();k++){
                tmp.push_back(nums[i]+nums[j]+nums[k]);
                
            }
        }
    }

    //sort(tmp.begin(),tmp.end());
    bool check = false;
    for(int i=0;i<tmp.size();i++){
        check = false;
        for(int j=2;j<tmp[i];j++){
            //소수가 아니라면 해당 조건문을 통해 걸러낸다.
            if(tmp[i] % j == 0){
                check = false;
                break;
            }
            check = true;
        }
        check == true?answer++: answer;
    }
    cout << answer << endl;
    return answer;
}


int main(){
    vector<int> number = {1,2,3,4};
    int result = solution(number);
    if(result == 1){
        cout << "success!" << endl;

    }
    else{
        cout << "fail!" << endl;
    }
    return 0;
}
*/