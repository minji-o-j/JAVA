package com.j2;
import java.util.ArrayList;
public class Selection{
  ArrayList<Rectangle>arr1=new ArrayList<Rectangle>();
  int sum=0;
  public void select (Rectangle r){//cube 선택가능(큐브->Rectangle이므로)
    r.setSelected(true);
    arr1.add(r);
    System.out.println("selected: "+r.isSelected);
  }

  // public void printr(){
  //   for(Rectangle r1:arr1){
  //     System.out.println(r1.toString());
  //   }
  // }
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
