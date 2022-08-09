class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean check=false;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int num=nums[i]+nums[j]+nums[k];
                    if(num>=2)  
                        check=sosu(num);
                    if(check==true) //소수인경우 ++
                        answer++;
                }
            }
        }
        
       

        return answer;
    }
     public boolean sosu(int num){  //소수인지 검사
            boolean chk=true;
            if(num==2){
                return chk;
            }
            for(int i=2;i<num;i++){ //소수가 아닌경우
                if(num%i==0){
                    chk=false;
                    break;
                }
            }
            return chk;
        }
}
