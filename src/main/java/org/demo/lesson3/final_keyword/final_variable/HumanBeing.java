package org.demo.lesson3.final_keyword.final_variable;

public class HumanBeing {

    private final int initialEyesAmount = 2;
    private String birthdayDate;

/*     Uncomment to see that final variable once assigned a value can never be changed
    public void setInitialEyesAmount(int initialEyesAmount){
        this.initialEyesAmount = initialEyesAmount;
    }*/

    public void setBirthdayDate(final String birthdayDate) {

        /*Uncomment to see that final argument is protected from reassignment
        birthdayDate = "New value";*/


        this.birthdayDate = birthdayDate;
    }
}
