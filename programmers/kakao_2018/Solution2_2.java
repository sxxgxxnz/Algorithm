//package kakao_2018;

import java.util.*;

public class Solution2_2 {
    
    public static void main(String[] args) {
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        solution(files);
    }

    public static String[] solution(String[] files) {
        String[] result = new String[files.length];
        String[][] strArr = new String[files.length][3];

        for(int i=0;i<files.length;i++){
            String s = files[i];

            int startNumberIdx = -1;
            int endNumberIdx = -1;
            int size = 0;
            boolean first = true;
            
            for(int j=0;j<s.length();j++){
                if(Character.isDigit(s.charAt(j))){
                    if(first){
                        startNumberIdx = j;
                        first = false;
                    }
                    size++;
                }else{
                    if(!first) break;
                }
            }
            endNumberIdx = startNumberIdx + size - 1;

            String head = s.substring(0,startNumberIdx);
            String number = s.substring(startNumberIdx,endNumberIdx+1);
            String tail = s.substring(endNumberIdx+1);

            strArr[i][0] = head;
            strArr[i][1] = number;
            strArr[i][2] = tail;
        }

        Arrays.sort(strArr, (o1,o2) -> {
            if(o1[0].toLowerCase().compareTo(o2[0].toLowerCase(Locale.ROOT))>0){
                return 1;
            }else if(o1[0].toLowerCase().compareTo(o2[0].toLowerCase(Locale.ROOT))<0){
                return -1;
            }else{  // HEAD의 차이가 없을경우(img == img), number비교
                if(Integer.parseInt(o1[1]) > Integer.parseInt(o2[1])){
                    return 1;
                }else if(Integer.parseInt(o1[1]) < Integer.parseInt(o2[1])){
                    return -1;
                }else{
                    return 0;
                }
            }
        });

        for(int i=0;i<result.length;i++){
            result[i] = strArr[i][0] + strArr[i][1] + strArr[i][2];
        }

        /*for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }*/
        return result;
    }

    
}
