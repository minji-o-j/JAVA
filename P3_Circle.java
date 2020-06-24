public class P3_Circle{
  float radius;
  float result;
  P3_Circle(float r){
    radius=r;
    result=r*r*(float)3.14;
  }

  public double calcArea(){
    System.out.printf("Area: %.1f PI",result);
    return 0;
  }

  public static void main(String[] args){
    P3_Circle c = new P3_Circle(7);
    c.calcArea();
  }

}
