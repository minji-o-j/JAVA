import java.util.Scanner;
public class CaculatorMain {
  public static void main(String[] args){
    double res=0.0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number1: ");
    Double n1=sc.nextDouble();
    System.out.print("Enter an Operator: ");
    String op=sc.next();
    System.out.print("Enter a number2: ");
    Double n2=sc.nextDouble();
    System.out.printf("%.2f %s %.2f", n1, op, n2);

    if(op.equals("+")) // if you want to compare objects, you must use CompareTo() or equals(), not "=="<-only native type
      res=n1+n2;
    else if(op.equals("-"))
      res=n1-n2;
    else if(op.equals("*"))
      res=n1*n2;
    else if(op.equals("/"))
      res=n1/n2;
    else
      System.out.println("Operation not supported");
    System.out.printf(" = %.2f\n",res);
  }
}
