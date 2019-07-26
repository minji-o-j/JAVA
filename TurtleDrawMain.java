import java.util.Scanner;
import ch.aplu.turtle.*; //*: wildcard ->all of the classes under directory
public class TurtleDrawMain{
  static Turtle t1=new Turtle();
  static enum Shape{TRIANGLE, SQUARE,RECTANCLE,PENTAGON,STAR}

  static void draw(int sides, int size){
    int interiorAngle=(sides-2)*180;
    int exteriorAngle=180-(interiorAngle/sides);
    for(int i=0;i<sides;i++){
      t1.forward(size);
      t1.right(exteriorAngle);
    }
  }
  static void drawStar(int size){
    for(int i=0;i<5;i++){
     t1.forward(size);
     t1.right(144);}
  }
  public static void main(String[] args){
    System.out.print("Enter Triangle, Square, Rectangle, Pentagon or Star: ");
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    Shape sel=Shape.valueOf(s.toUpperCase());
    int sides=0;
    int size=100;
    switch(sel){
      case TRIANGLE:
        sides=3;
        draw(sides,size);
        break;
      case SQUARE:
      case RECTANCLE:
        sides=4;
        draw(sides,size);
        break;
      case PENTAGON:
        sides=5;
        draw(sides,size);
        break;
      case STAR:
        drawStar(size);
        break;
    }
    System.out.printf("Drawing %s with sides %d\n",sel,sides);
  }
}
