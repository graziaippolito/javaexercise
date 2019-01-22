package org.demo.lesson3.interfaces_basics;

public class HumanBeing implements HumanSpeakable {

    @Override
    public void generateSpeech() {
        System.out.println("LOL, I'm human :)");
    }
}
