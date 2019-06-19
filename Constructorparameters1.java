class Constructorparameters1{


	int modelYear;
  String modelName;

  public Constructorparameters1(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Constructorparameters1 myCar = new Constructorparameters1(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
