//return�̿�
import java.util.Scanner;
public class RSP2{

  public String whoIsWinner(String a,String b){
    if((a.equals("����")&&b.equals("����"))||(a.equals("����")&&b.equals("��"))||(a.equals("��")&&b.equals("����"))){
      return ("\n������ �̰���ϴ�!!");
    }
    else if((b.equals("����")&&a.equals("����"))||(b.equals("����")&&a.equals("��"))||(b.equals("��")&&a.equals("����"))){
      return ("\nä���̰� �̰���ϴ�!!");
    }
    else
      return("\n---�����ϴ�---!!");
    }

  public static void main(String[] args){
    RSP2 rsp1=new RSP2();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter ���� or ���� or ��: ");
    System.out.print("����: ");
    String s1=sc.next();
    System.out.println("\nEnter ���� or ���� or ��: ");
    System.out.print("ä��: ");
    String s2=sc.next();
    System.out.printf("%s",rsp1.whoIsWinner(s1,s2));
  }
}
