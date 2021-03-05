import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
       
        List<Integer> list=new ArrayList<Integer>();
        
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int temp=numbers[i]+numbers[j];
                if(list.indexOf(temp)<0){   //중복값 입력 방지
                    list.add(temp);
                }
            }
        }
        
         int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
