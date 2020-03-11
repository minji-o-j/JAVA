import java.util.Date;
public class WhenTime{
  long totalMilliseconds=System.currentTimeMillis();
  public void printUTC(){
    long Years=totalMilliseconds/(1000L*60*60*24*365);
    long Day=totalMilliseconds/(1000L*60*60*24)%365;
    long Hours=totalMilliseconds/(1000L*60*60)%24;
    long Minutes=totalMilliseconds/(1000L*60)%60;
    long Seconds=totalMilliseconds/(1000L)%60;
    System.out.printf("Greenwich time is: %d %d %d %d %d", 1970+Years, Day, Hours, Minutes, Seconds );

  }
  public void printLocalTime(){
    System.out.println("\n\nCurrent time is"+new Date(totalMilliseconds));
  }
  public void printDue(){
    System.out.println("\nOverflow: "+new Date(Integer.MAX_VALUE*1000L));
  }
//  System.out.println(newDate(totalMilliseconds))

  public static void main(String[] args){
    WhenTime t=new WhenTime();
    t.printUTC();
    t.printLocalTime();
    t.printDue();

  }
}
