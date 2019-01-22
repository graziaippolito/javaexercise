package org.demo.lesson2.tasks.inheritance;


public class App {

    public static void main(String[] args) {

        VolleyPlayer paolaEgonu = new VolleyPlayer("Italy", 186, "opposite");
        VolleyPlayer feGaray = new VolleyPlayer("Brasil", 183, "outside hitter");

        Gymnast yuriChechi = new Gymnast("Italy", 162, "rings");
        Gymnast nadiaComaneci = new Gymnast("Romania", 163, "uneven bars");

        System.out.println("------ Paola Egonu: " + paolaEgonu.toString());
        System.out.println("------ Fernanda Garay: " + feGaray.toString());

        System.out.println("------ Yuri Chechi: " + yuriChechi.toString());
        System.out.println("------ Nadia Comaneci: " + nadiaComaneci.toString());
    }
}
