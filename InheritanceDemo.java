// InheritanceDemo.java

// 1️⃣ Single Inheritance
class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// 2️⃣ Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// 3️⃣ Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// 4️⃣ Interface-based Multiple Inheritance
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flies");
    }

    public void swim() {
        System.out.println("Duck swims");
    }
}

// ✅ Main class
public class InheritanceDemo {
    public static void main(String[] args) {

        System.out.println("------ Single Inheritance ------");
        Dog d = new Dog();
        d.sound();  // from Animal
        d.bark();   // from Dog

        System.out.println("\n------ Multilevel Inheritance ------");
        Puppy p = new Puppy();
        p.sound();  // from Animal
        p.bark();   // from Dog
        p.weep();   // from Puppy

        System.out.println("\n------ Hierarchical Inheritance ------");
        Cat c = new Cat();
        c.sound();  // from Animal
        c.meow();   // from Cat

        System.out.println("\n------ Interface-based Multiple Inheritance ------");
        Duck duck = new Duck();
        duck.fly();   // from Flyable
        duck.swim();  // from Swimmable
    }
}
