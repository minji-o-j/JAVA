
import java.util.Scanner;
public class RSP{

  public void whoIsWinner(String a,String b){
    if((a.equals("����")&&b.equals("����"))||(a.equals("����")&&b.equals("��"))||(a.equals("��")&&b.equals("����"))){
      System.out.println("\n������ �̰���ϴ�!!!!");
    }
    else if((b.equals("����")&&a.equals("����"))||(b.equals("����")&&a.equals("��"))||(b.equals("��")&&a.equals("����"))){
      System.out.println("\nä���̰� �̰���ϴ�!!!!");
    }
    else
      System.out.println("\n---�����ϴ�---");
    }
  }
  public static void main(String[] args){
    RSP rsp1=new RSP();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter ���� or ���� or ��: ");
    System.out.print("����: ");
    String s1=sc.next();
    System.out.println("\nEnter ���� or ���� or ��: ");
    System.out.print("ä��: ");
    String s2=sc.next();
    rsp1.whoIsWinner(s1,s2);
  }
}
