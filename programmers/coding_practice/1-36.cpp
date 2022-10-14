#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    if(arr.size() > 1){
        arr.erase(min_element(arr.begin(),arr.end()));
        answer = arr;
    }else{
        answer.push_back(-1);
    }
    return answer;
}