package org.demo.lesson3.tasks.interfaces_basics;

public interface Defense {


    default void blockDefense() {
        System.out.println("Jump and throw your hands over the net");
    }
}
