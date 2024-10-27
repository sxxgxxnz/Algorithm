package baekjoon;

import java.util.*;

public class FIFO {
    //페이지 교체 알고리즘
    public static void main(String[] args) {
        int size = 3; // 주기억장치 사이즈
        int[] arr = {7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0,1,7,0,1}; // 페이지 번호 배열
        solution(size,arr);
    }
    public static void solution(int size, int[] arr){
        Queue<Integer> caches = new LinkedList<>();
        int cnt = 0; //페이지 교체 횟수
        
        for(int x : arr){
            if(!caches.contains(x)){
                cnt++;
                if(caches.size() >= size){
                    caches.poll();
                }
                caches.add(x);
                continue;
            }
            
            if(caches.contains(x)){
                caches.poll();
            }
        }
        System.out.println(cnt+" "+caches);

    }
}
