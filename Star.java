import ch.aplu.turtle.*;
public class Star{
  private double startx;
  private double starty;
  private double length;
  Turtle pen;

  Star(double x, double y, double l){
    startx=x;
    starty=y;
    length=l;
    pen=new Turtle();
  }

  public void draw(){
    pen.penUp();
    pen.moveTo(startx,starty);
    pen.penDown();
    for(int i=0; i<5;i++){
      pen.forward(length);
      pen.right(216);
    }
  }

  public static void main(String[] args){
    Star d=new Star(0,0,200);
    d.draw();
  }
}
