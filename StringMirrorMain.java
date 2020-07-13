public class StringMirrorMain{
  static String mirror(String s){
    char[] charArr=s.toCharArray();  //(string->string[])
    StringBuffer olleh=new StringBuffer();
    for(int i=charArr.length-1;i>=0;i--)
    olleh.append(charArr[i]);
    return olleh.toString();
  }
  public static void main(String[] args){

    System.out.println(mirror("Sangmyung"));
  }

}
