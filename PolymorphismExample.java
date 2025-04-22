// File: PolymorphismExample.java

class CompileTimePolymorphism {
    // Method Overloading (Compile-time Polymorphism)
    void display() {
        System.out.println("No parameters");
    }

    void display(String name) {
        System.out.println("Hello, " + name);
    }

    void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

class RuntimePolymorphism {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends RuntimePolymorphism {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends RuntimePolymorphism {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Compile-time Polymorphism
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        obj.display();
        obj.display("Rishi");
        obj.display(5, 10);

        System.out.println("--------------------");

        // Runtime Polymorphism
        RuntimePolymorphism a;

        a = new Dog();  // upcasting
        a.makeSound();

        a = new Cat();  // upcasting
        a.makeSound();
    }
}
