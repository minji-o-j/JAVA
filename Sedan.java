interface Vehicle{
  public void signalTurn(Direction direction, boolean signalOn);
  public void changeSpeed(int newSpeed);
  public void start();
  public void stop();
  public enum Direction{LEFT,RIGHT}
}
//====================================================================
public class Sedan implements Vehicle{
  boolean power;
  int speed;
  @Override
  public void signalTurn(Direction direction, boolean signalOn){
    switch(direction){
    case LEFT:
      if(signalOn==true)
        System.out.println("Turning Left...");
      else
        System.out.println("Can't turn!");
      break;
    case RIGHT:
      if(signalOn==true)
        System.out.println("Turning Right...");
      else
        System.out.println("Can't turn!");
    }
  }
  @Override
  public void changeSpeed(int newSpeed){
    this.speed=newSpeed;
    System.out.printf("Changing speed now at speed %d\n",newSpeed);
  }
  @Override
  public void start(){
    this.power=true;
    System.out.println("Starting...");
  }
  @Override
  public void stop(){
    this.power=false;
    System.out.println("Stopping..");
  }

  public static void main(String[] args){
    Sedan s=new Sedan();
    Direction d=Direction.valueOf("LEFT");
    s.start();
    s.signalTurn(d,s.power);
    s.changeSpeed(40);
    s.stop();

  }
}
