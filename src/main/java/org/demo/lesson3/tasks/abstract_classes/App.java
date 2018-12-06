package org.demo.lesson3.tasks.abstract_classes;

public class App {

    public static void main(String[] args) {

        BuyFlightTicket buyTicket = new BuyFlightTicket();
        buyTicket.toDo();

        BookHotel hotel = new BookHotel();
        hotel.setCity("Tokio");
        hotel.getCity();
        hotel.toDo();

        RentLimousine limo = new RentLimousine();
        limo.toDo();

    }
}
