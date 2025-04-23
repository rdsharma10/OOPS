abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starting");
    }

    @Override
    void stop() {
        System.out.println("Car stopping");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}