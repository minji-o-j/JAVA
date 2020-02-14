import java.util.ArrayList;
import java.util.List;
//==============================================
public class RectangleMain{
  double sumx=0;
  double sumy=0;
  double[] ctr=new double[2];//ctr[0]=centerx, ctr[1]=centery
  static List<Double[]> coords=new ArrayList<Double[]>();



  public void setCoordinates(List<Double[]> coords){
    for(int i=0;i<coords.size();i++){
      sumx+=coords.get(i)[0];
      sumy+=coords.get(i)[1];
    }
  }

  public double[] getCenter(){
    ctr[0]=sumx/coords.size();
    ctr[1]=sumy/coords.size();
    return ctr;
  }

  public static void main(String[] args){
      RectangleMain r=new RectangleMain();
      Double[] c1={(double)(-100),-50.};
      Double[] c2={-100.,100.};
      Double[] c3={100.,50.};
      Double[] c4={50.,-50.};
      r.coords.add(c1);r.coords.add(c2);r.coords.add(c3);r.coords.add(c4);
      r.setCoordinates(r.coords);
      System.out.printf("Center is ( %f, %f)",r.getCenter()[0],r.getCenter()[1]);
  }
}
