import Abstration.Car;
import  Encapsulation.Student;
import Inheritence.Employee;
import Polymorphism.MethodOverloading.Calculator;
import Polymorphism.MethodOverriding.Dog;

import java.sql.SQLOutput;

public class Main {
    public static  void main(String[] args){
        System.out.println("hello intelli");

        // encapsulation demo
        System.out.println("Encapsulatoin Demo");
        Student s1 = new Student("franky",34);

        System.out.println("Student name: "+ s1.getName());
        System.out.println("Student age: "+s1.getAge());

        // set age and name

        s1.setName("Aditya");
        s1.setAge(24);
        System.out.println("Student name: "+ s1.getName());
        System.out.println("Student age: "+s1.getAge());

        System.out.println();


        // Inheritence demo
        System.out.println("Inheritance Demo");
        Employee e1 = new Employee("Rahul",25,500000);

        System.out.println("salary :"+e1.getSalary());
        e1.display();


        // polymorphism method overloading demo
        Calculator c = new Calculator();
        System.out.println(c.add(5,7));
        System.out.println(c.add(7.3,5.3));
        System.out.println(c.add("5","7"));



        // polymorphism method overriding
        Dog d = new Dog();
        d.speaks();




        // Abstraction example

        Car swift = new Car();
        swift.fuel();
        swift.start();










    }
}
