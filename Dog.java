import java.util.Arrays;
public class Dog implements Comparable{
  String name;
  String breed;
  public Dog(String name, String breed){
    this.name=name;
    this.breed=breed;
  }
  //@Override
    public int compareTo(Object o) {
        Dog d=(Dog)o;
        return this.name.compareTo(d.name);
    }
  //@Override
    public String toString() {
        String msg=name+" "+breed;
        return msg;
    }
  public static void main(String[] args){
    Dog[] dogs=new Dog[3];
    dogs[0]=new Dog("d2","Husky");
    dogs[1]=new Dog("d1","Poodle");
    dogs[2]=new Dog("d3","Shih Tzu");
    for(Dog t:dogs){
      System.out.println(t.toString());
    }
    System.out.println("\n");
    Arrays.sort(dogs);
    for(Dog t:dogs){
      System.out.println(t.toString());
    }
  }
}
