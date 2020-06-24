import java.lang.Math;
//import java.util.Scanner;
//==================================
class P5_Dice{
  protected int number;
  public void roll(){
    number=(int)(Math.random()*6)+1;
  }
  public int getnum(){
    return number;
  }
}
//==================================
class P5_Player{

  public String name;
  public int num;
  public P5_Player(String name){
    this.name=name;
  }
   public void play(){
    P5_Dice d1=new P5_Dice();
    d1.roll();
    this.num=d1.getnum();
    System.out.printf("%s: %d\n",name,num);

  }
}
//==================================
public class P5_DiceGame{

  P5_Player p1=new P5_Player("Minji");
  P5_Player p2=new P5_Player("Sohyeon");
  public void startGame(){
      System.out.println("Start the game\n");
      p1.play();
      p2.play();
      if (p1.num>p2.num){
        System.out.printf("Winner is %s",p1.name);
        }
      else if (p1.num<p2.num) {
        System.out.printf("Winner is %s",p2.name);
        }
      else{
        System.out.printf("%s's number and %s's number are same!",p1.name, p2.name);
        }
  }


  public static void main(String[] args){

    P5_DiceGame dg=new P5_DiceGame();
    dg.startGame();

    }
  }
