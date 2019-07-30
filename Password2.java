import java.util.Scanner;
public class Password2{
  public String passStr;
  public char[] array = new char[100];
  public int specialWord;
  public int Number;
  public int Letter;


  public boolean isLong(){
      this.array=passStr.toCharArray();
        if(array.length>8){
          return true;
        }
        else{
          return false;
        }
      }

  public boolean isValid(){

      this.specialWord=0;
      this.Number=0;
      this.Letter=0;

      for (int i=0; i<array.length; i++){



        if(array[i]=='!'|| array[i]=='@'|| array[i]=='#'|| array[i]=='$'||
        array[i]=='%'){
            this.specialWord++;


          }

        if(array[i]=='1'|| array[i]=='2'|| array[i]=='3'|| array[i]=='4'||
            array[i]=='5'|| array[i]=='6'|| array[i]=='7'|| array[i]=='8'||
            array[i]=='9'|| array[i]=='0'){
              this.Number++;
            }

       if(array[i]=='a'|| array[i]=='b'|| array[i]=='c'|| array[i]=='d'||
          array[i]=='e'|| array[i]=='f'|| array[i]=='g'|| array[i]=='h'||
          array[i]=='i'|| array[i]=='j'|| array[i]=='k'|| array[i]=='l'
          || array[i]=='m'|| array[i]=='n'|| array[i]=='o'|| array[i]=='p'
          || array[i]=='q'|| array[i]=='r'|| array[i]=='s'|| array[i]=='t'
          || array[i]=='u'|| array[i]=='v'|| array[i]=='w'|| array[i]=='x'
          || array[i]=='y'|| array[i]=='z'|| array[i]=='A'|| array[i]=='B'
          || array[i]=='C'|| array[i]=='D'|| array[i]=='E'|| array[i]=='F'
          || array[i]=='G'|| array[i]=='H'|| array[i]=='I'|| array[i]=='J'
          || array[i]=='K'|| array[i]=='L'|| array[i]=='M'|| array[i]=='N'
          || array[i]=='O'|| array[i]=='P'|| array[i]=='Q'|| array[i]=='R'
          || array[i]=='S'|| array[i]=='T'|| array[i]=='U'|| array[i]=='V'
          || array[i]=='W'|| array[i]=='X'|| array[i]=='Y'|| array[i]=='Z'){
          this.Letter++;
          }
        }


        if((Letter != 0) && (Number != 0) && (specialWord != 0)){
          return true;
        }
        else{
          return false;
        }
     }

  public static void main(String[] args){

    boolean result=false;

    Password2 p1 = new Password2();
    p1.passStr="Good!12";
    result=p1.isLong();
    result=p1.isValid();
    System.out.printf("length : %d, letter : %d, digits : %d, special char : %d",p1.array.length, p1.Letter, p1.Number, p1.specialWord);
    //System.out.println(p1.passStr);
    //System.out.println(p1.specialWord);
    //System.out.println(p1.Number);
    //System.out.println(p1.Letter);



  }



}
