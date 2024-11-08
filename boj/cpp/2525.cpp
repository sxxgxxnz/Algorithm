#include <bits/stdc++.h>

using namespace std;

int main(){
    /*
        내 풀이 (메모리는 같으나 코드 길이가 짧은게 더 좋은듯)
    */
    int hour, min, time;
    cin >> hour >> min ;
    cin >> time ;

    time += min;
    if(time < 60){
        cout << hour << " " << time;
    }else{
        int tmp = time;
        time /= 60;
        hour += time;
        min = tmp % 60;
        if(hour < 24){
            cout << hour << " " << min;
        }else{
            hour -= 24;
            cout << hour << " " << min;
        }
    }

    /*
        구글링으로 찾은 더 좋은 답안
       
        int a,b,c;
        cin >> a >> b >> c;

        int min = 60 * a + b; // 시 -> 분
        min += c;

        int hour = (min / 60 ) % 24;
        int minute = min % 60;

        cout << hour << " " << minute;
     */
}

