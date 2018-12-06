package org.demo.lesson2.inheritance;

public class Engineer extends Employee {

    private String engineeringArea;

    public Engineer(String name, int age, String engineeringArea) {
        super(name, age);
        this.engineeringArea = engineeringArea;
    }

    public String getEngineeringArea() {
        return engineeringArea;
    }

    public void setEngineeringArea(String engineeringArea) {
        this.engineeringArea = engineeringArea;
    }

    @Override
    public String toString() {
        return "\nEngineer {" + super.toString() +
               "\nengineeringArea = " + engineeringArea +
               "\n}";
    }
}
