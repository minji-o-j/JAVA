import java.lang.Math;
public class Dice{
  private int number;

  public void roll(){
    number=(int)(Math.random()*6)+1;
  }

  public int getNumber(){
    return number;
  }

  public static void main(String[] args){
    Dice num1=new Dice();
    Dice num2=new Dice();
    num1.roll();
    num2.roll();
    //Dice num2=new Dice();
    //num1.roll;
    System.out.println("A: "+num1.getNumber());
    System.out.println("B: "+num2.getNumber());
  }

}
