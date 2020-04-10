class Study2_2{
  static int i=0;
  public static void main(String []args){
    for(;i<10;i++){
      if(i%2==0){
        continue;
      }
      System.out.printf("%d is odd\n",i);
    }
  }
}
