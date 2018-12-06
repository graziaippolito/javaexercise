package org.demo.lesson2.tasks.inheritance;

//Java class
public class Player {


    private String nation;
    private int height;

    //Default constructor
    public Player() {
    }

    //Parameterized constructor
    public Player(String nation, int height) {
        this.nation = nation;
        this.height = height;
    }

    //Class method 'getNation()'. Is a getter for 'nation' field
    public String getNation() {
        return nation;
    }

    //Class method 'setnation()'. Is a setter for 'nation' field
    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "\nnation= " + nation +
               "\nheight= " + height;
    }
}
