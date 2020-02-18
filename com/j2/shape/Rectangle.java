package com.j2.shape;
class Rectangle implements IShape{
  private final double w,h;
  public Rectangle(double _w, double _h){
    this.w=_w;
    this.h=_h;
  }
  @Override
  public double calcArea(){
    return w*h;
  }
  @Override
  public double calcPerimeter(){
    return 2*(w+h);
  }
}
