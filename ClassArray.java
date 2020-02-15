import java.util.Arrays;
public class ClassArray implements Comparable{
  String name;
  String cn;
  public ClassArray(String cn, String name){
    this.name=name;
    this.cn=cn;
  }

  //classArray
  // @Override
  //   public int compareTo(Object o) {
  //       ClassArray d=(ClassArray)o;
  //       return this.cn.compareTo(d.cn);
  //   }

  //nameArray
  //@Override
    public int compareTo(Object o) {
        ClassArray d=(ClassArray)o;
        return this.name.compareTo(d.name);
      }

  //@Override
    public String toString() {
        String msg=cn+" "+name;
        return msg;
    }

  public static void main(String[] args){

    ClassArray[] arraynum=new ClassArray[3];

    arraynum[0]=new ClassArray("201810808","Minji");
    arraynum[1]=new ClassArray("201810800","Hyein");
    arraynum[2]=new ClassArray("201810780","Yujin");

    System.out.println("--Before line up--");
    for(ClassArray t:arraynum){
      System.out.println(t.toString());
    }

    System.out.println("\n");
    Arrays.sort(arraynum);

    System.out.println("--After line up--");
    for(ClassArray t:arraynum){
      System.out.println(t.toString());
    }

  }

}
