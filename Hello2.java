public class Hello2{
  private String toWhom="World";
  void sayHello() {
    System.out.println("Hello"+toWhom);
  }
  void setWhom(String whom){
    toWhom=whom;
  }
  public static void main(String[] args){
    Hello2 h=new Hello2();
    h.setWhom("MINJI");
    h.sayHello();
  }
}
