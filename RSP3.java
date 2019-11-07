//computer vs user
//input rock or scissor or paper to use scanner.
//
import java.util.Scanner;
public class RSP3{
  static enum ChooseRSP{ROCK,SCISSOR,PAPER}
  String[] ComSelect={"ROCK","SCISSOR","PAPER"};
  int rand=(int)(Math.random()*ComSelect.length);

  public String whoIsWinner(String a,String b){
    if((a.equals("ROCK")&&b.equals("SCISSOR"))||(a.equals("SCISSOR")&&b.equals("PAPER"))||(a.equals("PAPER")&&b.equals("ROCK"))){
      return ("\nYou Win!!\n");
    }
    else if((b.equals("ROCK")&&a.equals("SCISSOR"))||(b.equals("SCISSOR")&&a.equals("PAPER"))||(b.equals("PAPER")&&a.equals("ROCK"))){
      return ("\nComputer Win!!\n");
    }
    else
      return("\n---TIE---!!\n");
  }
  public static void main(String[] args){
    RSP3 rsp=new RSP3();
    System.out.print("Enter Rock, Scissor OR Paper: ");
    Scanner sc=new Scanner(System.in);
    String me=sc.next();

    ChooseRSP MySelect=ChooseRSP.valueOf(me.toUpperCase());
    System.out.println("-------------------------");
    System.out.printf("Computer: %s\nUser:%s\n",rsp.ComSelect[rsp.rand],MySelect);
    System.out.println("-------------------------");
    switch(MySelect){
      case ROCK:
        System.out.printf("%s",rsp.whoIsWinner("ROCK",rsp.ComSelect[rsp.rand]));
        break;
      case SCISSOR:
        System.out.printf("%s",rsp.whoIsWinner("SCISSOR",rsp.ComSelect[rsp.rand]));
        break;
      case PAPER:
        System.out.printf("%s",rsp.whoIsWinner("PAPER",rsp.ComSelect[rsp.rand]));
        break;
    }
  }
}
