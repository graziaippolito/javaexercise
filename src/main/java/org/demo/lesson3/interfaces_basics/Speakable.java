package org.demo.lesson3.interfaces_basics;

public interface Speakable {

    /*
     If if is not compiled for you, make sure that:
      "Idea IDE -> File -> Project Stricture -> Modules -> Sources tab -> Language level" is set to 8
      */
    default void generateSound() {
        System.out.println("Generating some sound ...");
    }
}
