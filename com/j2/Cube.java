package com.j2;

public class Cube extends Rectangle{
  double height;
  public Cube(double l,double w, double h){
    //Rectangle r=new Rectangle(l,w); <=��������(������ ����) ���� �� ���
    super(l,w); //<=��Ӱ���(��.�� ����)
    this.height=h;
  }
  public double getHeight(){
    return height;
  }

}
