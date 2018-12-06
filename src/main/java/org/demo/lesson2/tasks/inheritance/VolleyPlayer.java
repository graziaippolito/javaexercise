package org.demo.lesson2.tasks.inheritance;

public class VolleyPlayer extends Player {

    private String role;

    public VolleyPlayer(String nation, int height, String role) {
        super(nation, height);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String engineeringArea) {
        this.role = engineeringArea;
    }

    @Override
    public String toString() {
        return "\nVolleyPlayer {" + super.toString() +
               "\nrole = " + role +
               "\n}";
    }
}
