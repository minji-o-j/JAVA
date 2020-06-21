public class HelloKorea extends SayHello{
  public HelloKorea(String name){
    super(name);
  }
  @Override
  public void Hello() {
    System.out.println("annyeonghasaeyo "+ name);
  }
}
