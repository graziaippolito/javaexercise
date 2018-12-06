package org.demo.lesson2.inheritance;

/*
 Shortly to say, inheritance is the OOP ability that allows Java classes to be derived from other classes.
 */
public class App {

    public static void main(String[] args) {

        Driver busDriver = new Driver("Otto", 21, "C");
        Driver biker = new Driver("Anna", 18, "A");

        Engineer beEngineer = new Engineer("Martin", 45, "Backend Engineering");
        Engineer qaEngineer = new Engineer("Jenny", 25, "Quality Assurance Engineering");

        System.out.println("------ Bus driver: " + busDriver.toString());
        System.out.println("------ Biker: " + biker.toString());

        System.out.println("------ BE engineer: " + beEngineer.toString());
        System.out.println("------ QA engineer: " + qaEngineer.toString());
    }
}
