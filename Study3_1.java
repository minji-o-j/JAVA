public class Study3_1{
  static int a=10;
  static int b=20;
  static double c=10.5;
  static double d=20.0;
  static int result1;
  static double result2;
  double divide(int x, int y){
    return x/y;
  }
  public static void main(String[] args) {
    Study3_1 s=new Study3_1();
   // result1=s.divide(a,b);
   // result2=s.divide(c,d);
   // System.out.println("result1: "+result1+" result2: "+result2);
    System.out.printf("%d %d %d %d %f %f %f %f",a,b,c,d,a,b,c,d);
  }
}
