package org.demo.lesson3.interfaces_basics;

public class DogBeing implements Speakable,
                                 Funable{

    @Override
    public void slightlyBiteHand() {
        System.out.println("Bites a hand ...");
    }

    @Override
    public void lickFace() {
        System.out.println("Licks a face ...");
    }

    @Override
    public void playBall() {
        System.out.println("Plays with a ball ...");
    }
}
