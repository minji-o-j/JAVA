public abstract class Shape{
  public String name="Shape";
  public abstract double calcArea();
  public abstract double calcPerimeter();//�߻�method�� �ϳ��̻� �����ϱ�
  public String getName(){
    return this.name;
  };//abstract�� �ʿ䰡 ����
@Override
  public String toString(){
    return "Shape..."+super.toString();
  }
}
