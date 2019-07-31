public class Triangle {
  private int width;
  private int height;
  public Triangle(int w, int h){
    width=w;
    height=h;
  }
  public float computeArea(){
    return (float)(width+height)/2;
  }
  // public static void main(String[] args){
  //   Triangle t= new Triangle(3,4);
  //   System.out.println(t.computeArea());
  // }
}
