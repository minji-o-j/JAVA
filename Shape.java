public abstract class Shape{
  public String name="Shape";
  public abstract double calcArea();
  public abstract double calcPerimeter();//추상method가 하나이상 있으니까
  public String getName(){
    return this.name;
  };//abstract일 필요가 없음
@Override
  public String toString(){
    return "Shape..."+super.toString();
  }
}
