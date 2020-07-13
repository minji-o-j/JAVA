import java.util.Scanner;
public class StringRepeatMain{
  public static StringBuffer repeat(char ch, int times){ //repeat times //ch, times->factor
    StringBuffer s=new StringBuffer();
    //java.lang.StringBuffer (input X), if you want to make new class, you have to check javadoc
    for(int i=0;i<times;i++)
      s.append(ch);
    return s; // return Class(StringBuffer), if return type were char[], you must change line 4 to char[] type
  }

  public static void main(String[] args){
    System.out.print("Enter a number to repeat");
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt(); //next->like string,so we have to write type
    StringBuffer s=repeat('*',n);
    System.out.printf("%s\n",s);
    //15,16
    //delete line 15
    //16 -> System.out.printf("%s\n",repeat('*',n);
  }
}
