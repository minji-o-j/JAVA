package com.j2;
public class Rectangle{
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
