package org.demo.lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AppLinkedList {

    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("watermelon");
        fruits.add("apple");
        fruits.add("peach");

        System.out.println("FRUITS (list):" + fruits.toString());

        System.out.println("\n\n\nIterator:");
        Iterator itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println("FRUIT (one-by-one): " + itr.next());
        }

        System.out.println("FIRST FRUIT: " + ((LinkedList<String>) fruits).getFirst());
        System.out.println("LAST FRUIT: " + ((LinkedList<String>) fruits).getLast());
    }
}
