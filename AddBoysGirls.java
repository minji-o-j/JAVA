public class AddBoysGirls{
  int[][] numpeople={
    {74425,76326},
    {61164,61636},
    {109688,115744},
    {144796,146776},
    {174996,181676},
    {177841,177434},
    {204630,205980},
    {223373,232245},
    {161055,166130},
    {171576,176735},
    {279169,293772},
    {239450,251066},
    {148690,156510},
    {182977,196992},
    {237792,242641},
    {283869,296762},
    {209344,210282},
    {118965,114441},
    {186503,186856},
    {195734,203014},
    {254381,249472},
    {212401,229111},
    {271654,295354},
    {319197,335045},
    {229829,231671}
  };
  public int[] sum(){
    int[] sumdata=new int[2];
    for(int i=0;i<numpeople.length;i++){
      sumdata[0]+=numpeople[i][0];
      sumdata[1]+=numpeople[i][1];
    }
    return sumdata;
  }
  public int[] average(){
    int[] aver=new int[2];
    AddBoysGirls n=new AddBoysGirls();
    aver[0]=sum()[0]/numpeople.length;
    aver[1]=sum()[1]/numpeople.length;
    return aver;
  }
  public static void main(String[] args){
    AddBoysGirls n=new AddBoysGirls();
    System.out.printf("남자 합계: %d\n여자 합계: %d \n\n남자 평균: %d\n여자 평균: %d",n.sum()[0],n.sum()[1],n.average()[0],n.average()[1]);
  }
}
