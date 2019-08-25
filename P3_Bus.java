
public class P3_Bus{
    static String[] Type=new String[3];
    static String[] NTransfer=new String[3];
    static String[] km=new String[3];
    String a="Type";
    String b="Ntransfer";
    String c="km";
    String d="---------";

    public static void main(String[] args){
      P3_Bus bus=new P3_Bus();
      System.out.printf("%8s     %8s    %8s\n",bus.a,bus.b,bus.c);
      System.out.printf("%8s     %8s    %8s",bus.d,bus.d,bus.d);
    }
}
