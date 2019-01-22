package org.demo.lesson4;

import java.util.*;

public class AppSet {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

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

        //OR:
        System.out.println("\n\n\nForeach:");
        for (String fruit: fruits) {
            System.out.println("FRUIT (one-by-one): " + fruit);
        }
    }
}
