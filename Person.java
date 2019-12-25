// class Person {
//   private float weight=60;
//   public String name="Kim";
//
//   public void setWeight(float weight, String name){
//     this.weight=weight;
//     this.name=name;
//   }
//
//   public void getWeight(){
//     System.out.println(name+": " +Float.toString(weight)+"Kg");
//   }
//   public static void main(String[] args){
//     Person h = new Person();
//     h.getWeight();
//   }
// }
public class Person{
  private String name;
  //Float weight;
  private float weight;
  public Person(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public void setWeight(float weight){
    this.weight=weight;
  }
  public float getWeight(){
    return weight;
  }
  public static void main(String[] args){
    Person p=new Person("Kim");
    p.setWeight((float)65.0);
    String myName=p.getName();
    System.out.println(myName + " " + p.getWeight() + "Kg");
  }
}
