class A {
     public void eat()
    {
    System.out.println("eat from Superclass");
    }    
    public static void main(String[] args) {
        A a = new A();
        a.eat();
    }
}
class B extends A{
  void showB()
  {
    System.out.println(" this is child");
  }
  public static void main(String[] args) {
    A ob1= new A();
    ob1.eat();jav
  }
} 


