public class TriangleDrawTest{
  void drawTriangleWithChar(int height, String s){
  //  String s="*";
    String white=" ";
  //  int height=5;
    StringBuffer sbuf=new StringBuffer();
    for(int i=0;i<height;i++){
      for(int j=height;j>i;j--){
        sbuf.append(white);
      }
      for(int k=0;k<i;k++){
          sbuf.append(s);
          sbuf.append(s);
      }
      System.out.printf("%d %s\n",i,sbuf.toString());
      sbuf.delete(0,sbuf.length());
    }
  }
  public static void main(String[] args){
    TriangleDrawTest td=new TriangleDrawTest();
    td.drawTriangleWithChar(10,"$");
  }
}
