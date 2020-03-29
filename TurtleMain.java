abstract class Turtle{
  String name;
  double weight;
  public Turtle(String name,double weight){
    this.name=name;
    this.weight=weight;
  }

  abstract public double getWeight();
}
//==============================================
class SeaTurtle extends Turtle{
  public SeaTurtle(String name,double w){
    super(name,w);
  }
  @Override
  public double getWeight(){
    return weight*453.59237/1000;
  }
}
//==============================================
class LandTurtle extends Turtle{
  public LandTurtle(String name,double weight){
    super(name,weight);
  }
  @Override
  public double getWeight(){
    return weight/1000;
  }
}
//==============================================
public class TurtleMain{
  public static void main(String[] args){
    Turtle[] t=new Turtle[4];
    t[0]=new SeaTurtle("green",200.0);
    t[1]=new SeaTurtle("leatherback",1000.0);
    t[2]=new LandTurtle("commonbox",700.0);
    t[3]=new LandTurtle("painted",500.0);
    double totalWeight=0;
    for(int i=0;i<t.length;i++){
      totalWeight+=t[i].getWeight();
    }
    System.out.printf("Total %f kg= %f + %f + %f + %f",totalWeight,t[0].getWeight(),t[1].getWeight(),t[2].getWeight(),t[3].getWeight());
  }
}
