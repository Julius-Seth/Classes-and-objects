class Attribute3 {
  int x = 15;

  public static void main(String[] args) {
    Attribute3  myObj = new Attribute3 ();
    myObj.x = 30; // x is now 25
    System.out.println(myObj.x); 
  }
}