public class Rectangle extends Shape{
  private double width;
  private double height;
  private double area;
  private double pereimeter;
  public Rectangle(double w,double h){
    this.width=w;
    this.height=h;
    this.area=width*height;
    this.pereimeter=2*(width+height);
  }
  @Override
  public double calcArea(){
    return this.area;
  }
  @Override
  public double calcPerimeter(){
    return this.pereimeter;

  }
  @Override
  public String toString(){
    return "Rectangle..."+super.toString();
  }

}
