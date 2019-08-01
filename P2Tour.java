public class P2Tour{
  static String[] city=new String[5];
  public void printCities(){
    city[0]="Seoul";
    city[1]="New York";
    city[2]="Sydney";
    city[3]="Tokyo";
    city[4]="Beijing";

    for(int i=0;i<5;i++){
      System.out.printf("%s\n",city[i]);
    }
  }

  public static void main(String[] args){
    P2Tour tour=new P2Tour();
    tour.printCities();

  }

}
