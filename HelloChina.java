public class HelloChina extends SayHello{
  public HelloChina(String name){
    super(name);
  }
  @Override
  public void Hello() {
    System.out.println("Nihao "+ name);
  }
}
