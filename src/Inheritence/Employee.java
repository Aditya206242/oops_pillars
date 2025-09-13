package Inheritence;
// this is employee class
public class Employee extends Person {

    private  int salary ;


    public Employee(String name,int age,int salary){
        this.name = name;
        this.age= age;
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employee name : " + name);
        System.out.println("Employee age: " + age);
        System.out.println("Employee salary: " + salary);
    }




    public int getSalary() {
        return salary;
    }

}
