// class Animal {
//     public void eat() {
//         System.out.println("eat"); // Use System.out instead of System.err
//     }
//     String color;
//     int age;
//      void initObj(String c, int a)
//      {
//     color=c;
//     age=a;
//      }
//      void display()
//      {
//         System.out.println(color + " " + age );
//      }

//     public static void main(String[] args) {
//         System.out.println("Main");
//         Animal buzo = new Animal();
//         buzo.eat(); // Call the eat method
//         buzo.run();  
//         buzo.initObj("black", 10);
//         buzo.display();
//         Birds sp=new Birds();
//         sp.fly();
//     }
//     public void run()
//     {
//      System.out.println("i am ruuning");   
//     }
// }
// class Birds{
//     void fly()
//     {
//         System.out.println("flying");
//     }
// }
class Animal {
 void eat()
 {
    System.out.println("eating");
 }
    
}
 class  InnerAnimal extends Animal {
public static void main(String[] args) {
    InnerAnimal a =new InnerAnimal();
    a.eat();
}
}
