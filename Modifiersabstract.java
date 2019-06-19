abstract class Modifiersabstract{


  public String fname = "Julius";
  public int age = 19;
  public abstract void study(); // abstract method 
}

// Subclass (inherit from Person)
class Student extends Modifiersabstract {
  public int graduationYear = 2019;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Person.java

// Code from filename: MyClass.java
class MyClass {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student myObj = new Student(); 

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}


