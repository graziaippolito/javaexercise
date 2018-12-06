package org.demo.lesson3.tasks.interfaces_basics;

public class VolleyballGame implements Attack,
                                        Defense,
                                        Sport {

    @Override
    public void startGame() {
        System.out.println("A rollercoaster game!");

    }
    @Override
    public void diagonalSpike() {
        System.out.println("The ball hits the center of the court! Point!");
    }

    @Override
    public void parallelSpike() {
        System.out.println("The ball goes outside... :(");
    }

    @Override
    public void ace() {
        System.out.println("The ball reach 100km/h speed!");
    }
}
