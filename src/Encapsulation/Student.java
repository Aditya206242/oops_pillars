package Encapsulation;
///  this is student class
public class Student {

    private String name;
    private int age;

    // contructor
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }


    // getter and setter method
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){

        if(age>0){
            this.age = age;

        }

    }




}

