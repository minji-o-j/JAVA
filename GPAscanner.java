import java.util.Scanner;
public class GPAscanner{
  static String[] subject=new String[3];
  static int[] credits=new int[3];
  static String[] grade=new String[3];
  static Double[] gradeDouble=new Double[3];
  public static void inputGrade(){
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
      System.out.printf("Input Subject%d: ",i+1);
      String n1 = sc.next();
      subject[i]=n1;
      System.out.printf("Input credits%d: ",i+1);
      int n2 = sc.nextInt();
      credits[i]=n2;
      System.out.printf("Input grade%d: ",i+1);
      String n3 = sc.next();
      grade[i]=n3;

    }
  }
  public void gradeToDouble(){
      inputGrade();
      for(int i=0;i<3;i++){
        if (grade[i].equals("A+")){
          gradeDouble[i]=4.5;
        }
        else if (grade[i].equals("A")) {
          gradeDouble[i]=4.0;
        }
        else if (grade[i].equals("B+")) {
          gradeDouble[i]=3.5;
        }
        else if (grade[i].equals("B")) {
          gradeDouble[i]=3.0;
        }
        else if (grade[i].equals("C+")) {
          gradeDouble[i]=2.5;
        }
        else if (grade[i].equals("C")) {
          gradeDouble[i]=2.0;
        }
        else if (grade[i].equals("D+")) {
          gradeDouble[i]=1.5;
        }
        else if (grade[i].equals("D")) {
          gradeDouble[i]=1.0;
        }
        else{
          gradeDouble[i]=0.0;
        }
    }
  }
  public static void main(String[] args){
    GPAscanner gpa1=new GPAscanner();
    gpa1.gradeToDouble();
    float return_GPAplus=0;
    for(int i=0;i<3;i++)
    {
        return_GPAplus+=(double)credits[i]*gradeDouble[i];
    }
    System.out.printf("your GPA is: %f", return_GPAplus/(credits[0]+credits[1]+credits[2]));
  }

}
