
import java.util.Scanner;
public class RSP{

  public void whoIsWinner(String a,String b){
    if((a.equals("바위")&&b.equals("가위"))||(a.equals("가위")&&b.equals("보"))||(a.equals("보")&&b.equals("바위"))){
      System.out.println("\n민지가 이겼습니다!!!!");
    }
    else if((b.equals("바위")&&a.equals("가위"))||(b.equals("가위")&&a.equals("보"))||(b.equals("보")&&a.equals("바위"))){
      System.out.println("\n채운이가 이겼습니다!!!!");
    }
    else
      System.out.println("\n---비겼습니다---");
    }
  }
  public static void main(String[] args){
    RSP rsp1=new RSP();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 가위 or 바위 or 보: ");
    System.out.print("민지: ");
    String s1=sc.next();
    System.out.println("\nEnter 가위 or 바위 or 보: ");
    System.out.print("채운: ");
    String s2=sc.next();
    rsp1.whoIsWinner(s1,s2);
  }
}
