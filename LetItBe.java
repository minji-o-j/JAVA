import java.util.*;
public class LetItBe{
  static String[][] doc={
    {"When I find myself in times of trouble"},
    {"Mother Mary comes to me"},
    {"Speaking words of wisdom, let it be"},
    {"And in my hour of darkness"},
    {"She is standing right in front of me"},
    {"Speaking words of wisdom, let it be"},
    {"Let it be"},
    {"Let it be"},
    {"Let it be"},
    {"Let it be"},
    {"Whisper words of wisdom, let it be"}
};
  public Map countWords(String[][] doc) {
    Map<String, Integer> wc = new HashMap<String, Integer>();
    for(String[] sentence:doc) {
        for(String s:sentence) {
            String[] words=s.split("\\s+");
            for(String word:words) {
                //System.out.printf("/%s/",word);
                if (wc.containsKey(word)) {
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
        System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        if(entry.getValue()>c) {
            fc.put(entry.getKey(),entry.getValue());
        }
    }
    return fc;
  }
  public static void main(String[] args){
    LetItBe cd=new LetItBe();
    cd.countWords(doc);
    Map<String,Integer>pr=cd.getWordsFreqGreater(3,cd.countWords(doc));
    System.out.println(pr);

  }

}
