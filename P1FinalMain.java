import java.util.*;
public class P1FinalMain{
  Map<String,Integer> num=new HashMap<String,Integer>();
  ArrayList<String> lowerCase=new ArrayList<String>();
  static String[][]doc={
    {"As I Stand in this plaza with many of our citizens today to commemorate the 30th Anniversary of the June 10 Democratic Struggle, my hert is indeed filled with deep emotions."},
    {"People, ranging from teenagers to elders in their 70s, from Jeju to Seoul and from the southeastern part of Korea to the southwestern part of the country, shouted with one voice for constitutional revision and the end of dictatorship."},
    {"Their fervent chant is still ringing vividly in my ears."},
    {"In June, 30 years ago, se showed our greatness as a people."},
    {"In June, 30 years ago, we witnessed the victory of the people."}
};
  // public String[][] change(String[][]doc){
  //   String[][] change=lower(doc);
  //   return change;
  // }

  public Map countWords(String[][] doc) {
    Map<String, Integer> wc = new HashMap<String, Integer>();
    for(String[] sentence:doc) {
        for(String s:sentence) {
            String[] words=s.split("\\s+");

            for(String word:words) {
                //System.out.printf("/%s/",word);
                if (wc.containsKey(word)&&!(word.equals("I"))&&!(word.equals("we"))&&!(word.equals("a"))&&!(word.equals("an"))&&!(word.equals("the"))&&word.charAt(0)!='1'&&word.charAt(0)!='2'&&word.charAt(0)!='3'&&word.charAt(0)!='4'&&word.charAt(0)!='5'&&word.charAt(0)!='6'&&word.charAt(0)!='7'&&word.charAt(0)!='8'&&word.charAt(0)!='9'&&word.charAt(0)!='0') {
                    if((int)word.charAt(0)>=65&&(int)word.charAt(0)<=90){
                      (word.charAt(0))+=32;
                    }
                    wc.put(word,wc.get(word)+1);
                } else {
                    wc.put(word,1);
                }
            }
        }
    }
    return wc;
}

Map getWordsFreqGreater(int c,Map<String,Integer> wc){
    Map<String, Integer> fc = new HashMap<String, Integer>();
    for (Map.Entry<String, Integer> entry : wc.entrySet()) {
        //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        if(entry.getValue()>=c) {
            fc.put(entry.getKey(),entry.getValue());
        }
    }
    return fc;
  }
  public static void main(String[] args){
    P1FinalMain cd=new P1FinalMain();
    cd.countWords(doc);
    Map<String,Integer>pr=cd.getWordsFreqGreater(2,cd.countWords(doc));
    System.out.println(pr);

  }

}
