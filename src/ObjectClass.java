class Car {         // A simple class named Car
    String color = "Red";     // Data members (variables)
    int year = 2022;

    void displayInfo() {         // Method (function inside class)
        System.out.println("Car color: " + color);
        System.out.println("Car year: " + year);
    }
}
public class ObjectClass {              // Main class
    public static void main(String[] args) {
        Car myCar = new Car();    // Creating object of Car class
        myCar.displayInfo();      // Calling method using object
    }
}