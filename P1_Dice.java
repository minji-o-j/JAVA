
import java.lang.Math;
import java.util.Date;
public class P1_Dice{
  private int number;

  public void roll(){
    number=(int)(Math.random()*6)+1;
  }

  public int getNum(){
    return number;
  }

  public static void main(String[] args){
    P1_Dice num11=new P1_Dice();
    P1_Dice num12=new P1_Dice();
    P1_Dice num13=new P1_Dice();
    P1_Dice num14=new P1_Dice();
    P1_Dice num15=new P1_Dice();
    P1_Dice num21=new P1_Dice();
    P1_Dice num22=new P1_Dice();
    P1_Dice num23=new P1_Dice();
    P1_Dice num24=new P1_Dice();
    P1_Dice num25=new P1_Dice();

    num11.roll();
    num21.roll();
    num12.roll();
    num22.roll();
    num13.roll();
    num23.roll();
    num14.roll();
    num24.roll();
    num15.roll();
    num25.roll();
    int sum1=num11.getNum()+num12.getNum()+num13.getNum()+num14.getNum()+num15.getNum();
    int sum2=num21.getNum()+num22.getNum()+num23.getNum()+num24.getNum()+num25.getNum();
    System.out.printf("A: %d %d %d %d %d  sum: %d\n",num11.getNum(),num12.getNum(),num13.getNum(),num14.getNum(),num15.getNum(),sum1);
    System.out.printf("B: %d %d %d %d %d  sum: %d\n",num21.getNum(),num22.getNum(),num23.getNum(),num24.getNum(),num25.getNum(),sum2);
    if(sum1>sum2){
      System.out.println("A wins!");
    }

    else if(sum1<sum2){
      System.out.println("B wins!");
    }
    else
      System.out.println("A's sum and B's sum are same");
  }

}
