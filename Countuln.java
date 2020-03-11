import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Countuln{
  Map<String,Integer> num=new HashMap<String,Integer>();
  ArrayList<String> upperCase=new ArrayList<String>();
  ArrayList<String> lowerCase=new ArrayList<String>();
  ArrayList<Integer> number=new ArrayList<Integer>();
  int ascii;
  String keyName;
  public Map getFrequencies(String t){

    char[] letters=t.toCharArray();
    for(char c:letters){
      ascii=(int)c;
      if(ascii>=48&&ascii<=57){
        keyName="DIGITS";
        number.add(Character.getNumericValue(c));
      }
      else if(ascii>=65&&ascii<=90){
        keyName="UPPERCASES";
        upperCase.add(Character.toString(c));
      }
      else if(ascii>=97&&ascii<=122){
        keyName="LOWERCASES";
        lowerCase.add(Character.toString(c));
      }
      //System.out.println(num);
      if(num.containsKey(keyName)){
        num.put(keyName,num.get(keyName)+1);
      }
      else{
        num.put(keyName,1);
      }
    }
    return num;
  }
  public static void main(String[] args){
    Countuln n=new Countuln();
    n.getFrequencies("7HongiDong");
    System.out.println(n.num);
    System.out.println(n.number);
    System.out.println(n.upperCase);
    System.out.println(n.lowerCase);
  }
}
