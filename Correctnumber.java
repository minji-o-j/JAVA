import java.util.Scanner;
public class Correctnumber{
  private int com;
  private int user;
  static Scanner sc= new Scanner(System.in);
  public void level1(){
    this.com=(int)(Math.random()*2+1);
    System.out.println("[Level 1]Enter the number(1~2):");
    user=sc.nextInt();
    if(com==user){
      System.out.println("Correct!!");
      level2();
    }
    else System.out.println("Fail!");
  }
  public void level2(){
    this.com=(int)(Math.random()*4+1);
    System.out.println("[Level 2]Enter the number (1~4): ");
    user=sc.nextInt();
    if(com==user){
      System.out.println("Correct!!");
      level3();
    }
    else System.out.println("Fail!");
  }
  public void level3(){
    this.com=(int)(Math.random()*8+1);
    System.out.println("[Level 3]Enter the number(1~8): ");
    user=sc.nextInt();
    if(com==user)
      System.out.println("Lucky!!");
    else
      System.out.println("Fail!");
  }
  public static void main(String [] args){
    Correctnumber n=new Correctnumber();
    n.level1();
  }
}
