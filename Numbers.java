//import java.util.Scanner;

public class P1Numbers{
  private int start;
  private int plus;


  public void printSum(int from, int to)
  {
    start=from;
    plus=0;
    while(start<=to){
      plus+=start;
      start++;
    }
    System.out.printf("SUM: from %d to %d : %d",from,to,plus);
  }


  public static void main(String[] args){
    P1Numbers num=new P1Numbers();
    num.printSum(1,101);
  }
}
