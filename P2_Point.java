/*
*@author jmj
*@since 20190419
*/
import java.util.Scanner;
import java.lang.Math;
class Point{
  int x;
  int y;
}
//==================================================================
public class P2_Point{
  public static Point p0=new Point();
//----------------------------------------------------------------
  public double distance(Point o1,Point o2){
    double a=0;
    double t1=0;
    double t2=0;
    t1=Math.pow(o2.x-o1.x,2);
    t2=Math.pow(o2.y-o1.y,2);
    a=Math.pow(t1+t2,(double)1/2);
    return a;
  }
//----------------------------------------------------------------
  public Point add(Point other){
    p0.x+=other.x;
    p0.y+=other.y;
    return p0;
  }
//----------------------------------------------------------------
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Point p1=new Point();
    Point p2=new Point();
    P2_Point pt=new P2_Point();
    System.out.println("(input (x1,y1): )");
    System.out.print("x1: ");
    p1.x=sc.nextInt();
    System.out.print("y1: ");
    p1.y=sc.nextInt();
    System.out.println("\n(input (x2,y2): )");
    System.out.print("x2: ");
    p2.x=sc.nextInt();
    System.out.print("y2: ");
    p2.y=sc.nextInt();

    System.out.printf("\n\ndistance ((%d, %d), (%d, %d)): %f\n\n",p1.x,p1.y,p2.x,p2.y,pt.distance(p1,p2));

    pt.add(p1);
    pt.add(p2);
    System.out.printf("(%d, %d) + (%d, %d) = (%d, %d)",p1.x,p1.y,p2.x,p2.y,p0.x,p0.y);

  }

}
