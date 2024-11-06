import java.util.*;

public class Solution2_1 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        solution(record);
    }
    public static String[] solution(String[] record) {
        String[] answer = {};
        Map<String,String> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<record.length;i++){
            String[] str = record[i].split(" ");
            String cmd = str[0];
            String uid = str[1];

            if(cmd.equals("Enter")){
                map.put(uid,str[2]);
                sb.append(uid+"님이 들어왔습니다.").append("/");
            }else if(cmd.equals("Leave")){
                sb.append(uid+"님이 나갔습니다.").append("/");
            }else if(cmd.equals("Change")){
                map.put(uid,str[2]); 
            }
        }

        String s = sb.toString();
        String[] arr = s.split("/");
        answer = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int idx = arr[i].indexOf("님");
            String uid = arr[i].substring(0,idx);
            if(!map.get(uid).isEmpty()){
                answer[i]=arr[i].replace(uid,map.get(uid));
            }
            
        }
        return answer;
    }
}
