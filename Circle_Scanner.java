import java.util.Scanner;
public class Circle_Scanner{
  float radius;
  float result;
   Circle_Scanner(float r){
    radius=r;
    result=r*r*(float)3.14;
  }

  public double calcArea(){
    System.out.printf("Area: %.1f PI",result);
    return 0;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float n1=sc.nextFloat();
  //  P3_Circle c = new P3_Circle(7);
     Circle_Scanner c=new  Circle_Scanner(n1);
     c.calcArea();
  }

}
