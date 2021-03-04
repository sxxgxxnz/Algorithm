class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int i=0;i<phone_book.length-1;i++){
            for(int j=i+1;j<phone_book.length;j++){
                boolean bool=phone_book[j].startsWith(phone_book[i]);
                boolean bool2=phone_book[i].startsWith(phone_book[j]);
                
                if(bool)
                {
                    answer=false;
                }
                if(bool2){
                    answer=false;
                }
            }
        }
       
        return answer;
    }
}
