public class Constructors {
    String names;
    int age;
    public Constructors(String names,int age)
    {
        this.names=names;
        this.age=age;
    }

    public void display() {
        System.out.println("Name: " + names);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args)
    {
        Constructors Emp1= new Constructors("Rishi",22);
        Constructors Emp2= new Constructors("Rahul",25);
      Emp1.display();
      Emp2.display();
    }
}
