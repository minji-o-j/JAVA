class Coffee{
  static String orgin="Ethiopia Yirgacheffe";
  static int degreeOfRoast=200;
  static int grade=1;

  static void roast() {
    System.out.println("roasting " + orgin + "... degree: " + degreeOfRoast +"C");
  }
  static void grind() {
    System.out.println("grinding " + orgin + "...");
  }
  static void brew() {
    System.out.println("brewing " + orgin + "... grade: "+grade);
  }
  public static void main(String[] args) {
      roast();
      grind();
      brew();
  }
}
