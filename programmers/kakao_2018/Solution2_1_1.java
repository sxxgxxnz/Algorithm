import java.util.*;

public class Solution2_1_1 {
    public static void main(String[] args) {
        //LZW 압축 알고리즘 구현하는 문제
        String msg = "KAKAO";
        System.out.println(solution(msg).toString());
    }

    public static int[] solution(String msg){
        ArrayList<String> dic = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<26;i++){
            dic.add(String.valueOf((char)('A'+i)));
        }

        for(int i=0;i<msg.length();i++){
            for(int j=dic.size()-1;j>=0;j--){
                if(msg.substring(i).startsWith(dic.get(j))){
                    i += dic.get(j).length() - 1;
                    result.add(j+1);
                    
                    if(i+1 < msg.length()){
                        dic.add(dic.get(j)+msg.charAt(i+1));
                    }
                    break;
                }
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}
