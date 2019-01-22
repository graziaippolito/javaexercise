package org.demo.lesson3.tasks.abstract_classes;

public abstract class PerfectHoliday {

    private String city;

    protected abstract void toDo();

    public void setCity(String city) {
        this.city = city;
    }
    public void getCity() {
        System.out.println("Our super special destination is " + city);
    }

    public static void provideNumberOfVacationsDays() {
        System.out.println("Number of vacation days is 45");
    }
}
