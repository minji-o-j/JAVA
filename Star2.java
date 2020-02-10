import ch.aplu.turtle.*;
public class Star2{
  public static void draw(int size){
    Turtle t1=new Turtle();
    for(int i=0;i<5;i++){
      t1.right(144);
      t1.forward(size);
    }
  }
  public static void main(String[]args){
    draw(100);
  }
}
