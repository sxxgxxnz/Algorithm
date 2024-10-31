import java.util.*;

public class Solution2_1 {
    // 주차 요금 계산
    public static void main(String[] args) {
        // 기본 시간, 기본 요금, 단위 시간, 단위 요금
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        int[] answer = solution(fees, records);
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }

    public static int[] solution(int[] fees, String[] records){
        int[] answer = {};
        //주차한 차 번호와 입차시간(입출차 데이터 저장/삭제)
        Map<String, Integer> parking = new HashMap<String, Integer>();
        //차 번호와 누적된 시간(트리맵으로 차량번호(키)기준으로 오름차순)
        Map<String, Integer> costs = new TreeMap<String, Integer>();

        int baseTime = fees[0];
        int baseFee = fees[1];
        int partTime = fees[2];
        int partFee = fees[3];

        for(String record : records){
            String[] arr = record.split(" ");
            int time = getTime(arr[0]);
            String carNum = arr[1];
            String io = arr[2];

            if(io.equals("IN")){ // 입차
                parking.put(carNum,time);
            }else if(io.equals("OUT")){  // 출차
                int inTime = parking.get(carNum);
                parking.remove(carNum);
                if(costs.containsKey(carNum)){
                    int aTime = costs.get(carNum);
                    costs.replace(carNum,aTime + time - inTime);
                }else {
                    costs.put(carNum, time - inTime);
                }
            }
        }
        int lastTime = 1439;
        for(String car : parking.keySet()){ //출차하지 못한 차 누적 시간 계산
            int inTime = parking.get(car);
            if(costs.containsKey(car)){
                int aTime = costs.get(car);
                costs.replace(car, aTime + lastTime - inTime);
            }else{
                costs.put(car, lastTime - inTime);
            }
        }
        Object[] key = costs.keySet().toArray();
        answer = new int[key.length];

        for(int i=0;i<answer.length;i++){
            int result = baseFee;
            String car = String.valueOf(key[i]);

            int val = costs.get(car);
            
            if(val > baseTime){
                result = (int)(baseFee + Math.ceil((double)(val-baseTime)/partTime)*partFee);
            }
            answer[i] = result;
            
        }
        return answer;
    }

    public static int getTime(String time){
        String[] str = time.split(":");
        int h = Integer.parseInt(str[0]) * 60;
        int m = Integer.parseInt(str[1]);
        return h + m;
    }
}
