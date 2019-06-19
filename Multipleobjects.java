 class Multipleobjects {
  int x = 15;

  public static void main(String[] args) {
    Multipleobjects myObj1 = new Multipleobjects();  // Object 1
   Multipleobjects myObj2 = new Multipleobjects();  // Object 2
    myObj2.x = 30;
    System.out.println(myObj1.x);  // Outputs 15
    System.out.println(myObj2.x);  // Outputs 30
  }
}