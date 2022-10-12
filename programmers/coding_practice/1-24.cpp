#include <string>
#include <vector>

using namespace std;

bool solution(int x) {
    bool answer = true;
    int h=0, init = x;
    while(x!=0){
        h+=x%10;
        x/=10;
    }
    if(init % h != 0 ){
        answer= false;
    }
    return answer;
}