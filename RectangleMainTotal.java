package com.j2;
import java.util.ArrayList;

class Cube extends Rectangle{
  double height;
  public Cube(double l,double w, double h){

    super(l,w);
    this.height=h;
  }
  public double getHeight(){
    return height;
  }

}

class Selection{
  ArrayList<Rectangle>arr1=new ArrayList<Rectangle>();
  int sum=0;
  public void select (Rectangle r){
    r.setSelected(true);
    arr1.add(r);
    System.out.println("selected: "+r.isSelected);
  }

  public void printc(){
    for(Rectangle c1:arr1){
      System.out.println(c1.toString());
    }
  }
  public void selected(){
    for(Rectangle c1:arr1){
      System.out.println(c1.getSelected());
    }
  }
  public int totallength(){
    for(Rectangle c1:arr1){
      sum+=c1.getLength();
    }
    return sum;
  }
}
class Rectangle{
  protected double length;
  protected double width;
  protected boolean isSelected;
  public Rectangle(double l, double w){   //overloading
    this.length=l;
    this.width=w;
  }
  public double getLength(){
    return length;
  }
  public double getWidth(){
    return width;
  }
  public void setSelected(boolean b){
    isSelected=b;
  }
  public boolean getSelected(){
    return isSelected;
  }
}
public class RectangleMainTotal{

  public static void main(String[] args){
    Selection s1=new Selection();
    Rectangle r1= new Rectangle(10.0,20.0);
    Rectangle r2= new Rectangle(30.0,40.0);
    Cube c1=new Cube(1.0,2.0,3.0);
    Cube c2=new Cube(4.0,5.0,6.0);
    Cube c3=new Cube(7.0,8.0,9.0);
    //5개의 사각형 객체, 하나만 선택이 안되게 함 , 도형목록 출력, length합계 출력
  //  System.out.printf("Rectangle 1: %.2f %.2f\n",r1.getLength(),r1.getWidth());
  //  System.out.printf("Rectangle 2: %.2f %.2f\n",r2.getLength(),r2.getWidth());

  //  System.out.printf("Cube 1: %.2f %.2f %.2f",c1.getLength(),c1.getWidth(),c1.getHeight());

    Selection s= new Selection();
    s.select(r1);
    s.select(r2);
    s.select(c1);
    s.select(c2);
    s.printc();
    s.selected();
    System.out.println(s.totallength());


  }
}
