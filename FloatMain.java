import java.util.Scanner;
public class FloatMain{
  static void larger(float x, float y){
    Float xobj=new Float (x);
    Float yobj=new Float(y);
    int cmp=xobj.compareTo(yobj);///345 -> new Float(4).compareTo(new Float(5));
    if(cmp>0)
      System.out.printf("%f is greater than %f",x,y);
    else if(cmp<0){
      System.out.printf("%f is less than %f",x,y);
    }
    else
      System.out.printf("%f is equal than %f",x,y);
  }
  public static void main(String[] args){
    System.out.print("Enter two decimal numbers: ");
    Scanner sc=new Scanner(System.in);//or String
    float f1=sc.nextFloat();
    float f2=sc.nextFloat();
    larger(f1,f2);
  }
}
