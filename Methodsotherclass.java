
class Multipleclasses{




  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
}



class Methodsotherclass{


  public static void main(String[] args) {
    Multipleclasses myCar = new Multipleclasses();   
    myCar.fullThrottle();      
    myCar.speed(400);          
  }
}

