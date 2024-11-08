import java.io.*;
import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.StringTokenizer;

class Main1924{
    // 2007년
    public static void main(String[] args) throws IOException,ParseException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        
        LocalDate date = LocalDate.of(2007,month,day);
        
        DayOfWeek week = date.getDayOfWeek();
        
        int weekNum = week.getValue();

        if(weekNum==1){
            System.out.println("MON");
        }else if(weekNum == 2){
            System.out.println("TUE");
        }else if(weekNum == 3){
            System.out.println("WED");
        }else if(weekNum == 4){
            System.out.println("THU");
        }else if(weekNum == 5){
            System.out.println("FRI");
        }else if(weekNum == 6){
            System.out.println("SAT");
        }else if(weekNum == 7){
            System.out.println("SUN");
        }
        
    }
}