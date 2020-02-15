import java.util.Arrays;
import java.util.Scanner;
public class ClassArray2 implements Comparable{
  String name;
  String cn;
  public ClassArray2(String cn, String name){
    this.name=name;
    this.cn=cn;
  }

  ////classArray
  @Override
    public int compareTo(Object o) {
        ClassArray2 d=(ClassArray2)o;
        return this.cn.compareTo(d.cn);
    }

  ////nameArray
  //@Override
    // public int compareTo(Object o) {
    //     ClassArray2 d=(ClassArray2)o;
    //     return this.name.compareTo(d.name);
    //   }

  //@Override
    public String toString() {
        String msg=cn+" "+name;
        return msg;
    }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ClassArray2[] arraynum=new ClassArray2[3];
    for(int i=0;i<arraynum.length;i++){
      System.out.printf("Input %d: ClassNumber, Name: ",i+1);
      arraynum[i]=new ClassArray2(sc.next(),sc.next());
    }

    System.out.print("\n");
    
    System.out.println("--Before line up--");
    for(ClassArray2 t:arraynum){
      System.out.println(t.toString());
    }

    System.out.print("\n");
    Arrays.sort(arraynum);

    System.out.println("--After line up--");
    for(ClassArray2 t:arraynum){
      System.out.println(t.toString());
    }

  }

}
