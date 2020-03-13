import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

class Dice{
  private int number1;
  public void roll(){
    number1=(int)(Math.random()*6)+1;
  }
  public  int getNum(){
    return number1;
  }
}


class Player{
  private String name;
  public int number2;

  Player() {}
  public Player(String name){
      this.name = name;
      
  }
  /*static void play(){


  }*/
}

public class DiceGame{

  static void startGame(){
    System.out.println("Start the game");
  }


  public static void main(String []args){
    //startGame();
    Player p1=new Player("KIM");
    Player p2=new Player("JANG");
    Dice d1=new Dice();
    Dice d2=new Dice();
    d1.roll();
    d2.roll();
    //p1.number2=d1.getNum();
    //p2.number2=d2.getNum();

    System.out.printf("Who is winner?\n");

    if(p1.number2>p2.number2)
      System.out.println("the winner is p1");
    else if(p1.number2<p2.number2)
      System.out.println("the winner is p2");
    else
      System.out.println("finish a tie");
 }
}
