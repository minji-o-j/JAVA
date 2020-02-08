class Grade{

Object[][] marks={
    {"English", 100.0},{"Math", 80.0},{"English", 70.0},{"Math", 100.0},{"English", 82.3},{"Math", 98.5}
  };
  public double[] getAvg(){
    double[] avg={0.0,0.0};
    int englishCount=0;
    int mathCount=0;
    for(Object[] obj:marks){
      String subj=(String)obj[0]; //subject
      double mark=(double)obj[1]; //score
      if (subj.equals("English")){
        avg[0]+=mark;
        englishCount+=1;
      }
      else if(subj.equals("Math")){
        avg[1]+=mark;
        mathCount+=1;
      }
    }
    avg[0]/=englishCount;
    avg[1]/=mathCount;
    return avg;
  }


}
