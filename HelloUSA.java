public class HelloUSA extends SayHello{
  public HelloUSA(String name){
    super(name);
  }
  @Override
  public void Hello() {
    System.out.println("Hello "+ name);
  }
}
