abstract class SayHello{
 protected String name;
 public SayHello(String name) {
   this.name=name;
 }
 abstract public void Hello();
}
class HelloUSA extends SayHello{
  public HelloUSA(String name){
    super(name);
  }
  @Override
  public void Hello() {
    System.out.println("Hello "+ name);
  }
}

class HelloKorea extends SayHello{
  public HelloKorea(String name){
    super(name);
  }
  @Override
  public void Hello() {
    System.out.println("annyeonghasaeyo "+ name);
  }
}
class HelloChina extends SayHello{
  public HelloChina(String name){
    super(name);
  }
  @Override
  public void Hello() {
    System.out.println("Nihao "+ name);
  }
}


public class HelloTotal{

  public static void main(String[] args){
    SayHello[] h=new SayHello[3];
    h[0]=new HelloUSA("MINJI");
    h[1]=new HelloKorea("JungMinJi");
    h[2]=new HelloChina("MingZyu");

    for(SayHello e:h){
      e.Hello();
    }
  }
}
