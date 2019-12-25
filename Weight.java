class Weight {
  private float myWeight=10;
  public String myName="MIN";

  public void setWeight(float w, String n){
    this.myWeight=w;
    this.myName=n;
  }

  public void getWeight(){
    System.out.println(myName+": " +Float.toString(myWeight)+"Kg");
  //  System.out.print(myWeight);
  }
  public static void main(String[] args){
    Weight my = new Weight();
    my.getWeight();
  }
}
// public static void main(String[] args){
//   Weight my = new Weight(10,"MIN");
//   my.getWeight();
// }
