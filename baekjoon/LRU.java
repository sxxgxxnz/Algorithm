package baekjoon;

import java.util.LinkedList;
import java.util.List;

public class LRU {
    //페이지 교체 알고리즘
    public static void main(String[] args) {
        int size = 3; // 주기억장치 사이즈
        int[] arr = {7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0,1,7,0,1}; // 페이지 번호 배열
        solution(size,arr);
    }
    
    public static List<Integer> solution(int size, int[] arr){
       
        int cnt = 0; //페이지 교체 횟수
        
        List<Integer> caches = new LinkedList<>();
        for(int x : arr){
            // caches miss
            if(!caches.contains(x)){
                cnt++;
                if(caches.size() >= size){
                    caches.remove(0);   //가장 앞에 있는게 오래동안 사용 안한 캐시이므로 0번째 제거
                }
                caches.add(x);
                continue;
            }

            //caches hit
            if(caches.contains(x)){
                caches.remove(Integer.valueOf(x));
                caches.add(x);
                
            }
        }
        
        System.out.println(cnt+" "+caches);
        return caches;
    }
}
