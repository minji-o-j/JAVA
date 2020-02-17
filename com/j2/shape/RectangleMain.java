package com.j2.shape;
//import com.j2.shape.Rectangle;-->same directory(don't have to import)
//import com.j2.shape.IShape;
public class RectangleMain{
  public static void main(String[] args){
    Rectangle r=new Rectangle(10.,20.);
    //== IShape r=new Rectangle(10.,20.);
    System.out.println("AREA: "+r.calcArea());
    System.out.println("PERIMETER: "+r.calcPerimeter());

  }
}
