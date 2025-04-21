// OOPDemo.java

// Interface (Abstraction + Multiple Inheritance)
interface Engine {
    void start();
    void stop();
}

// Abstract class (Abstraction)
abstract class Vehicle {
    protected String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void drive(); // abstract method

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Inheritance & Interface implementation
class Car extends Vehicle implements Engine {
    private int speed; // Encapsulation

    // Constructor
    Car(String brand, int speed) {
        super(brand); // calling Vehicle constructor
        this.speed = speed;
    }

    // Encapsulation - Getter
    public int getSpeed() {
        return speed;
    }

    // Encapsulation - Setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Method Overriding (Runtime Polymorphism)
    @Override
    void drive() {
        System.out.println("Driving car at " + speed + " km/h");
    }

    // Interface methods
    public void start() {
        System.out.println("Car engine started.");
    }

    public void stop() {
        System.out.println("Car engine stopped.");
    }

    // Method Overloading (Compile-time Polymorphism)
    void drive(String roadType) {
        System.out.println("Driving on " + roadType);
    }
}

// Main class
public class OOPDemo {
    public static void main(String[] args) {
        // Object creation
        Car myCar = new Car("Toyota", 120);

        // Demonstrating OOP concepts
        myCar.displayBrand();          // Inherited method
        myCar.start();                 // Interface method
        myCar.drive();                 // Overridden method
        myCar.drive("highway");        // Overloaded method
        myCar.setSpeed(150);           // Encapsulation
        System.out.println("Speed: " + myCar.getSpeed());
        myCar.stop();
    }
}
