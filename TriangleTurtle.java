/*
*@author jmj
*@since 20190411
*/

// javac -classpath lib\aplu5.jar -d classes -sourcepath src src\TriangleTurtle.java
//
// java -classpath lib\aplu5.jar;classes TriangleTurtle
import ch.aplu.turtle.*;

public class TriangleTurtle{

  private double x1coord;
  private double y1coord;
  private double z1coord;
  private double x2coord;
  private double y2coord;
  private double z2coord;
  Turtle pen;

  //void momomo(double x1, double y1, double z1, double x2, double y2, double z2)
  TriangleTurtle(double x1, double y1, double z1, double x2, double y2, double z2){
    x1coord =x1;
    y1coord=y1;
    z1coord=z1;
    x2coord =x2;
    y2coord=y2;
    z2coord=z2;
    pen=new Turtle();
  }

  public void draw(){
    pen.penUp();
    pen.moveTo(x1coord,x2coord);
    pen.penDown();
    pen.moveTo(y1coord,y2coord);
    pen.moveTo(z1coord,z2coord);
    pen.moveTo(x1coord,x2coord);

    }

    public static void main(String[] args){
    TriangleTurtle s=new TriangleTurtle(0.0,0.0,100.0,0.0,50.0,50.0);
    //s.momomo(0.0,0.0,100.0,0.0,50.0,50.0);
    s.draw();
    }
  }
