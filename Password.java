public class Password{
//========================================
  static boolean isLong(int n){
    if(n>=8)
      return true;
    else
      return false;
  }
  //========================================
  static boolean isValid(int a, int b, int c){
    if(a>=1&&b>=1&&c>=1)
      return true;
    else
      return false;
  }
  //========================================
  public static void main(String[] args){
    String password="smug405%@";
    //static String[] password = new String[5];
    int n=password.length();
    boolean b1=isLong(n);
    int le_count=0;
    int di_count=0;
    int sp_count=0;

    for(int i=0;i<n;i++){
      char passwd=password.charAt(i);
      if(passwd=='0'|| passwd=='1'||passwd=='2'||passwd=='3'||passwd=='4'||passwd=='5'||passwd=='6'||passwd=='7'||passwd=='8'||passwd=='9'){
        di_count++;
      }
      else if(passwd=='!'||passwd=='@'||passwd=='#'||passwd=='$'||passwd=='%'){
        sp_count++;
      }
      else
        le_count++;
    }

    boolean b2=isValid(sp_count,di_count,le_count);
    if(b1==true&&b2==true){
      System.out.printf("%s is valid with length: %d, letter: %d, digits: %d, special chars: %d",password,n,le_count,di_count,sp_count);
    }
  }
}
