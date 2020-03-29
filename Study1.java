import java.util.Scanner;
class Study1{
  private String name;
  private int age;
  private float GPA;
  public Study1(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public void setAge(int age){
    this.age=age;
  }
  public int getAge(){
    return age;
  }
  public void lineUp(String name, int age, float GPA){
    System.out.printf("\n\nName: %6s\nAge: %6s\nGPA: %6s",name,age,GPA);
  }
  public static void main(String[] args){
    Study1 s=new Study1("Minji");
    s.setAge(22);
    String myName=s.getName();
    System.out.println("Name: "+myName+"\nAge: "+s.getAge());
    Scanner sc=new Scanner(System.in);
    System.out.print("GPA: ");
    float a=sc.nextFloat();
    s.lineUp(s.getName(),s.getAge(),a);
  }
}
