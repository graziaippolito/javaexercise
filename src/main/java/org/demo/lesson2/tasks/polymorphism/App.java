package org.demo.lesson2.tasks.polymorphism;



/*
 Shortly to say, polymorphism in Java allows subclasses of a class to define their own unique behaviors
 and yet share some of the same functionality of the parent class.
 */
public class App {

    public static void main(String[] args) {
        Dog dogLivingCreature = new Dog();
        Cat catLivingCreature = new Cat();
        Duck duckLivingCreature = new Duck();


        dogLivingCreature.sayHello();

        catLivingCreature.sayHello();

        duckLivingCreature.sayHello();

    }
}
