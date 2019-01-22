package org.demo.lesson4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class AppMap {

    public static void main(String[] args) {
        Map<Integer, String> fruits = new HashMap<>();

        fruits.put(1, "apple");
        fruits.put(2, "banana");
        fruits.put(3, "watermelon");
        fruits.put(4, "apple");
        fruits.put(5, "peach");

        System.out.println("FRUITS (list):" + fruits.toString());

        System.out.println("\n\n\nIterator:");

        Iterator itr = fruits.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println("FRUIT (one-by-one): " + itr.next());
        }

        System.out.println("\n\n\nNavigation through entries:");
        for (Map.Entry<Integer, String> fruit : fruits.entrySet()){
            System.out.println("Key: " + fruit.getKey());
            System.out.println("Value: " + fruit.getValue());
        }
    }
}
