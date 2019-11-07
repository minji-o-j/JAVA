//return이용
import java.util.Scanner;
public class RSP2{

  public String whoIsWinner(String a,String b){
    if((a.equals("바위")&&b.equals("가위"))||(a.equals("가위")&&b.equals("보"))||(a.equals("보")&&b.equals("바위"))){
      return ("\n민지가 이겼습니다!!");
    }
    else if((b.equals("바위")&&a.equals("가위"))||(b.equals("가위")&&a.equals("보"))||(b.equals("보")&&a.equals("바위"))){
      return ("\n채운이가 이겼습니다!!");
    }
    else
      return("\n---비겼습니다---!!");
    }

  public static void main(String[] args){
    RSP2 rsp1=new RSP2();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 가위 or 바위 or 보: ");
    System.out.print("민지: ");
    String s1=sc.next();
    System.out.println("\nEnter 가위 or 바위 or 보: ");
    System.out.print("채운: ");
    String s2=sc.next();
    System.out.printf("%s",rsp1.whoIsWinner(s1,s2));
  }
}
