import java.lang.Math;
import java.util.Date;
public class P2_Time{
  long totalMilliseconds=System.currentTimeMillis();
  long WhenMonth;
  public static long Day2;
  public  void printUTC(){
    long Years=totalMilliseconds/(1000L*60*60*24*365);
    long Day=totalMilliseconds/(1000L*60*60*24)%365;
    long Hours=totalMilliseconds/(1000L*60*60)%24;
    long Minutes=totalMilliseconds/(1000L*60)%60;
    long Seconds=totalMilliseconds/(1000L)%60;
    Day2=Day;
  //  long WhenMonth;
    Day-=11;
  //  long Day;
    P2_Time Mon=new P2_Time();
    if (Day<=31){
      Mon.WhenMonth=01;

    }
    else if(Day<=59){
      Mon.WhenMonth=02;
      Day=Day-31;
    }
    else if(Day<=90){
      Mon.WhenMonth=03;
      Day=Day-59;
    }
    else if(Day<=120){
      Mon.WhenMonth=04;
      Day=Day-90;
    }
    else if(Day<=151){
      Mon.WhenMonth=05;
      Day=Day-120;
    }

    else if(Day<=181){
      Mon.WhenMonth=06;
      Day=Day-151;
    }
    else if(Day<=211){
      Mon.WhenMonth=07;
      Day=Day-181;
    }
    else if(Day<=242){
      Mon.WhenMonth=8;
      Day=Day-211;
    }
    else if(Day<=273){
      Mon.WhenMonth=9;
      Day=Day-242;
    }
    else if(Day<=303){
      Mon.WhenMonth=10;
      Day=Day-273;
    }
    else if(Day<=334){
      Mon.WhenMonth=11;
      Day=Day-303;
    }
    else {
      Mon.WhenMonth=12;
      Day=Day-334;
    }



    System.out.printf("Current time: %d-%d-%d %d:%d:%d\n", 1970+Years, Mon.WhenMonth, Day, Hours, Minutes, Seconds );

    long oy=2038-Years-1971;
    long od=365+29-Day2;
    System.out.printf("%d years %d days left",oy, od);
  }

  public void printDue(){
    System.out.println("\nOverflow: "+new Date(Integer.MAX_VALUE*1000L));
  }


  public static void main(String[] args){
    P2_Time t=new P2_Time();
    t.printUTC();


  }
}
