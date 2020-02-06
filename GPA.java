// import java.util.Scanner;
public class GPA{
  static String[] subject=new String[3];
  static int[] credits=new int[3];
  static String[] grade=new String[3];
  static Double[] gradeDouble=new Double[3];
  public static void inputGrade(){
    subject[0]="English";
    subject[1]="JAVA";
    subject[2]="MATH";
    credits[0]=2;
    credits[1]=3;
    credits[2]=3;
    grade[0]="A+";
    grade[1]="A+";
    grade[2]="B+";
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
    GPA gpa1=new GPA();
    gpa1.gradeToDouble();
    float return_GPAplus=0;
    for(int i=0;i<3;i++)
    {
        return_GPAplus+=(double)credits[i]*gradeDouble[i];
    }
    System.out.printf("your GPA is: %f", return_GPAplus/(credits[0]+credits[1]+credits[2]));
  }

}
