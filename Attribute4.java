 class Attribute4 {
  final int x = 20;

  public static void main(String[] args) {
    Attribute4 myObj = new Attribute4();
    myObj.x = 30; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x); 
  }
}