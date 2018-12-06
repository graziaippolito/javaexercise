package org.demo.lesson2.inheritance;

//Java class
public class Employee {

    /* Class fields 'name' and 'age'. Basically saying, Java field is a variable inside a class
     * Field Declaration Syntax: [access_modifier] [static] [final] type name [= initial value] ;
     */
    private String name;
    private int age;

    //Default constructor
    public Employee() {
    }

    //Parameterized constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Class method 'getName()'. Is a getter for 'name' field
    public String getName() {
        return name;
    }

    //Class method 'setName()'. Is a setter for 'name' field
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nname=" + name +
               "\nage=" + age;
    }
}
