package org.demo.lesson2.tasks.polymorphism;




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
