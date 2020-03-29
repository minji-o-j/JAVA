import java.util.Scanner;
class Study1_1{
  private String name;
  private int age;
  private float GPA;
//=================================
  public Study1_1(String name){
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

  public static void main(String[] args){
    Study1_1 s=new Study1_1("PHJ");
    s.setAge(21);
    System.out.println("Name: "+s.getName()+"\nAge: "+s.getAge());
  }

}
