package org.demo.lesson3.abstract_classes;

public class App {

    public static void main(String[] args) {

        /* Uncomment to see a compilation error
        AbstractIdea abstractIdea = new AbstractIdea();
        */

        TicketCreationAction ticketCreationAction = new TicketCreationAction();
        ticketCreationAction.implement();


        AbstractIdea ticketDiscussionAction = new TicketDiscussionAction();
        ticketDiscussionAction.implement();

        //Can also work as AbstractIdea.provideMinimalNumberOfParticipants(); without warning
        ticketDiscussionAction.provideMinimalNumberOfParticipants();


        AbstractIdea ticketImplementationAction = new TicketDiscussionAction();
        ticketImplementationAction.setEstimationDays(5);
        ticketImplementationAction.provideEstimationDays();


        ticketCreationAction.implement();

         /* Uncomment to see a compilation error
        ticketImplementationAction.release();
        */
    }
}
