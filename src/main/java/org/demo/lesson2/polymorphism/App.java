package org.demo.lesson2.polymorphism;

/*
 Shortly to say, polymorphism in Java allows subclasses of a class to define their own unique behaviors
 and yet share some of the same functionality of the parent class.
 */
public class App {

    public static void main(String[] args) {
        BrazilianHumanBeing brazilianHumanBeing = new BrazilianHumanBeing();
        ItalianHumanBeing italianHumanBeing = new ItalianHumanBeing();
        RomanianHumanBeing romanianHumanBeing = new RomanianHumanBeing();
        UkrainianHumanBeing ukrainianHumanBeing = new UkrainianHumanBeing();

        brazilianHumanBeing.sayILoveYou();
        brazilianHumanBeing.smile();

        italianHumanBeing.sayILoveYou();
        italianHumanBeing.smile();

        romanianHumanBeing.sayILoveYou();
        romanianHumanBeing.smile();

        ukrainianHumanBeing.sayILoveYou();
        ukrainianHumanBeing.smile();
    }
}
