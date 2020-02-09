public class GradeMain{
  public static void main(String[] args){
    Grade g=new Grade();
    double[] avg=g.getAvg();
    System.out.printf("English avg:%.1f Math avg:%.1f",avg[0],avg[1]);
  }
}
