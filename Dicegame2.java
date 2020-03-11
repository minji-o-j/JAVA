import java.lang.Math;
class Dices{
  public int number;
  public void roll(){
    this.number=(int)(((Math.random()*6)+1);
  }
  public int getNum(){
    return number;
  }


}


class Player{
  public String name;
  public int num;
  public Player(String name){
    this.name=name;
  }

  public void Play(){
    Dices d1 = new Dices();
    d1.roll();
    this.num=d1.getNum();
  }

}


public class Dicegame2{
Player p1 = new Player("Minji");
Player p2 = new Player("Sohyeon");
void startGame(){
  p1.Play();
  p2.Play();
  System.out.println("Player1 " +p1.name+ " :" +p1.num);
  System.out.println("Player2 " +p2.name+ " :" +p2.num);

  if(p1.num>p2.num){
    System.out.println(p1.name+" is winner");
  }
  else if(p1.num<p2.num){
    System.out.println(p2.name+" is winner");
  }
  else{
    System.out.println("draw");
  }
}

public static void main(String[] args){
  Dicegame2 x = new Dicegame2();
  x.startGame();

  }
}
