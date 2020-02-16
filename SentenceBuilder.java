public class SentenceBuilder{
  public StringBuilder build(){
    StringBuilder sb=new StringBuilder();
    String[] subjects={"I","You","We","A friend of mine"};
    String[] verbes={"play","love","eat"};
    String[] objects={"a football","to cook"};
    int rand1=(int)(Math.random()*subjects.length);
    int rand2=(int)(Math.random()*verbes.length);
    int rand3=(int)(Math.random()*objects.length);
    sb.append(subjects[rand1]);
    sb.append(" ");
    sb.append(verbes[rand2]);
    sb.append(" ");
    sb.append(objects[rand3]);

    return sb;
  }
}
