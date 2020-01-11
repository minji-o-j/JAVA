import java.util.Scanner;
public class Point2{
   public double x;
   public double y;

   Point2(double x1, double y1){
     this.x=x1;
     this.y=y1;
   };

   Point2(){}

   public static double absolute(double x1, double x2){

     if(x1-x2>0){
       return x1-x2;
     }
     else{
       return x2-x1;
     }

   }

   public static double distance(Point2 pos1, Point2 pos2){

     double xdistance = absolute(pos1.x, pos2.x);
     double ydistance = absolute(pos1.y, pos2.y);
     double result = Math.sqrt (xdistance*xdistance+ydistance*ydistance);

     return result;
   }

   public static Point2 add(Point2 pos1, Point2 pos2){
     double xpos=pos1.x+pos2.x;
     double ypos=pos1.y+pos2.y;
     Point2 pos3 = new Point2();
     pos3.x=xpos;
     pos3.y=ypos;
     return pos3;

   }

   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the pos1(x, y)");
     double x1=sc.nextDouble();
     double y1=sc.nextDouble();
     System.out.print("Enter the pos2(x, y)");
     double x2=sc.nextDouble();
     double y2=sc.nextDouble();

     Point2 pos1 = new Point2(x1, y1);
     Point2 pos2 = new Point2(x2, y2);
     System.out.printf("distance (%.2f, %.2f), (%.2f, %.2f) : %.2f \n", pos1.x, pos1.y, pos2.x, pos2.y, distance(pos1, pos2));
     Point2 pos3 = new Point2();
     pos3 = add(pos1,pos2);
     System.out.printf("(%.2f, %.2f) + (%.2f, %.2f) = (%.2f, %.2f)", pos1.x, pos1.y, pos2.x, pos2.y, pos3.x, pos3.y);




   }


 }
