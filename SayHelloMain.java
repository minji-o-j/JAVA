public class SayHelloMain{

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
