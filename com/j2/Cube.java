package com.j2;

public class Cube extends Rectangle{
  double height;
  public Cube(double l,double w, double h){
    //Rectangle r=new Rectangle(l,w); <=연관관계(동등한 관계) 있을 때 사용
    super(l,w); //<=상속관계(상.하 관계)
    this.height=h;
  }
  public double getHeight(){
    return height;
  }

}
