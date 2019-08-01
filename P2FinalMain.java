import java.util.*;
public class P2FinalMain implements Comparable{
  String name;
  String cn;
  String check;
  int all;
  public P2FinalMain(String cn, String name,String check,int all){
    this.name=name;
    this.cn=cn;
    this.check=check;
    this.all=all;
  }

  //classArray
  @Override
    public int compareTo(Object o) {
        P2FinalMain d=(P2FinalMain)o;
        return this.cn.compareTo(d.cn);
    }



  @Override
    public String toString() {
        String msg=cn+" "+name;
        return msg;
    }

  public static void main(String[] args){

    P2FinalMain[] arraynum=new P2FinalMain[5];
    arraynum[0]=new P2FinalMain("201411111","lim js","O",100);
    arraynum[1]=new P2FinalMain("201811111","kim js","O",89);
    arraynum[2]=new P2FinalMain("201211111","lee js","O",65);
    arraynum[3]=new P2FinalMain("201511111","choi js","X",66);
    arraynum[4]=new P2FinalMain("201311111","park js","X",80);
    int sum=0;
    System.out.println("----coming----");
    for(P2FinalMain t:arraynum){
      if(t.check=="O")
        System.out.println(t.toString());
    }

    System.out.println("\n");
    Arrays.sort(arraynum);

    System.out.println("--After soting--");
    for(P2FinalMain t:arraynum){
      System.out.println(t.toString());
    }

    System.out.println("\n");
    System.out.println("--Summing credits..--");
    for(P2FinalMain t:arraynum){
      System.out.printf("%10s %-10s%3d\n",t.cn,t.name,t.all);
      sum+=t.all;
    }
    System.out.printf("%24d",sum);
  }
}
