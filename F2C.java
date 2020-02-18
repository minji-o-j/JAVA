


import java.util.Scanner;

public class F2C{
  public static void f2c(float f){
    float celsius=((float)5/9)*(f-32);
    System.out.printf("F %.1f -> %.1f C",f,celsius);
  }

  public static void main(String[] args){
    System.out.print("Entef Fahrenheit: ");
    Scanner sc=new Scanner(System.in);
    Float f = sc.nextFloat();
    f2c(f);
  }
}

// public class F2C{
//   public static void f2c(float f){
//     float celsius=((float)5/9)*(f-32);
//     System.out.printf("F %.1f -> %.1f C",f,celsius);
//   }
//
//   public static void main(String[] args){
//     System.out.print("Entef Fahrenheit: ");
//     Scanner sc=new Scanner(System.in);
//     Float f = sc.nextFloat();
//     f2c(f);
//   }
// }
// //error
// src\F2C.java:9: error: cannot find symbol
//     Scanner sc=new Scanner(System.in);
//     ^
//   symbol:   class Scanner
//   location: class F2C
// src\F2C.java:9: error: cannot find symbol
//     Scanner sc=new Scanner(System.in);
//                    ^
//   symbol:   class Scanner
//   location: class F2C
// 2 errors
