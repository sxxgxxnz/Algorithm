#include <bits/stdc++.h>

using namespace std;

int main(){
    int n;
    string word;
    int cnt = 0;

    cin >> n;
    for(int i=0;i<n;i++){
        cin >> word;
        bool alphabet[26]={false, };

        //아스키코드 값에서 97을 뺀 값을 인덱스값
        // 첫 번째 알파벳 값을 true로 설정
        alphabet[(int)(word[0]) - 97]=true;

        for(int i=1;i<word.size();i++){
            // 연속
            if(word[i]==word[i-1]){ 
                continue;
            }
            // 연속하지 않고, 해당 알파벳 배열 값이 true라면
            // 그룹단어가 아님
            else if(word[i]!=word[i-1] && alphabet[(int)(word[i])-97]==true){
                cnt++;
                break;
            }else{
                alphabet[(int)(word[i])-97] = true;
            }
        }
    }
    cout << n - cnt;
}