package org.demo.lesson2.tasks.inheritance;

/*
 Shortly to say, inheritance is the OOP ability that allows Java classes to be derived from other classes.
 */
public class App {

    public static void main(String[] args) {

        VolleyPlayer PaolaEgonu = new VolleyPlayer("Italy", 186, "opposite");
        VolleyPlayer FeGaray = new VolleyPlayer("Brasil", 183, "outside hitter");

        Gymnast YuriChechi = new Gymnast("Italy", 162, "rings");
        Gymnast NadiaComaneci = new Gymnast("Romania", 163, "uneven bars");

        System.out.println("------ Paola Egonu: " + PaolaEgonu.toString());
        System.out.println("------ Fernanda Garay: " + FeGaray.toString());

        System.out.println("------ Yuri Chechi: " + YuriChechi.toString());
        System.out.println("------ Nadia Comaneci: " + NadiaComaneci.toString());
    }
}
