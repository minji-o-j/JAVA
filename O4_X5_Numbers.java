import java.util.ArrayList;
public class O4_X5_Numbers{
  ArrayList<Integer> myList=new ArrayList<Integer>();
  public void setNumbers(){
    for(int x=0;x<1000;x++){
      if (x%4==0 && x%5!=0){
          myList.add(x);
      }
    }
  }
  public int sumList(){
    int sum=0;
    for(Integer i:myList){
      System.out.printf("%d..",i);
      sum+=i;
    }
      return sum;
  }
}
