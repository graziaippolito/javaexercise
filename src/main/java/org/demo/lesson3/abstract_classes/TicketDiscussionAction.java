package org.demo.lesson3.abstract_classes;

/*
 * To use an abstract class, you have to inherit it from another class,
 * provide implementations to the abstract methods in it.
 *
 * If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.
 */
public class TicketDiscussionAction extends AbstractIdea {

    @Override
    protected void implement() {
        System.out.println("Discussing a ticket on grooming session ...");
    }
}
