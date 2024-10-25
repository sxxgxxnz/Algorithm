
import java.util.*;

class Solution2_1 {
    public static void main(String[] args) {
        //LZW 압축 알고리즘 구현하는 문제
        String msg = "KAKAO";
        System.out.println(solution(msg));
    }

    public static List<Integer> solution(String msg){
        Map<String, Integer> map = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

        int idx = init(map);

        for(int i=0;i<msg.length();i++){
            String word = "";
            
            // 가장 긴 문자열 찾기
            while(i < msg.length() && map.containsKey(word + msg.charAt(i))){
                word+=msg.charAt(i);
                i++;
            }

            //찾은 문자열의 인덱스 answer 리스트에 add
            answer.add(map.get(word));

            // 남은 문자가 있을 경우
            if(i<msg.length()){
                map.put(word + msg.charAt(i),idx);
                idx++;
                i--;
            }
        }
        return answer;
    }

    private static int init(Map<String, Integer> map){
        int idx = 1;
        for(char ch = 'A';ch<='Z';ch++){
            // 문자열 그대로 만들어서 반환하기 위해 valueof() 사용
            map.put(String.valueOf(ch),idx++);
        }
        return idx;
    }
}