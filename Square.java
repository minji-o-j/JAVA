/*
*@author jmj
*@since 20190326
*/
import ch.aplu.turtle.*;
public class Square{
  private double xcoord;
  private double ycoord;
  private double size;
  Turtle pen;

  Square(double x, double y, double s){
    xcoord =x;
    ycoord=y;
    size=s;
    pen=new Turtle();
  }
  public void draw(){
    pen.penUp();
    pen.moveTo(xcoord,ycoord);
    pen.penDown();
    for(int i=0; i<4;i++){
      pen.forward(size);
      pen.right(90);
    }
  }
  public static void main(String[] args){
  Square s=new Square(0.0,100.0,100.0);
  s.draw();
  }
}
