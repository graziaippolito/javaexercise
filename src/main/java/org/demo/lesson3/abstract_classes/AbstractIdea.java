package org.demo.lesson3.abstract_classes;

/*
 * If a class is declared abstract, it CANNOT BE instantiated.
 * Try AbstractIdea abstractIdea = new AbstractIdea(); and you will catch compilation error
 */
public abstract class AbstractIdea {

    private int estimationDays;

    /* Abstract classes may or may not contain abstract methods
     * BUT ...
     * If a class has AT LEAST ONE abstract method, it MUST be an ABSTRACT class
     */
    protected abstract void implement();

    public void setEstimationDays(int estimationDays) {
        this.estimationDays = estimationDays;
    }

    public void provideEstimationDays() {
        System.out.println("Estimation days number is set to " + estimationDays);
    }

    public static void provideMinimalNumberOfParticipants() {
        System.out.println("Minimal number of participants is 2");
    }
}
