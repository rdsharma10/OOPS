// import java.util.*;/
public class oops {
    //creating a new data type with multiple attribute 
    public static class Student{
        String name;
        int rollno;
        double percent;
    }
    public static class Car{
        String name;
        String type;
        int price;
    }
    public static void main(String[] args) {
   Student x=new Student();//object 1
   x.name="Rishi";
   x.rollno=215;
   x.percent=85.5;  

   Student s=new Student();//object2 
   s.name="Rahul";
   s.rollno=216;
   s.percent=85.5;

   Car c1=new Car();
   c1.name="BMW";
   c1.price=3000000;
   c1.type="SUV";

    }
}