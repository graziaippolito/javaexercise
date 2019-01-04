package org.demo.lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppArrayList {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("watermelon");
        fruits.add("apple");
        fruits.add("peach");


        System.out.println("FRUITS (list):" + fruits.toString());

        System.out.println("\n\n\nIterator:");
        Iterator itr = fruits.iterator();
        while (itr.hasNext()) {
            String someFruit = String.valueOf(itr.next());
            if (someFruit.equals("banana")){
                System.out.println("I've found banana");
            }
            System.out.println("FRUIT (one-by-one): " + someFruit);
        }

        //OR:
        System.out.println("\n\n\nForeach:");
        for (String fruit: fruits) {
            System.out.println("FRUIT (one-by-one): " + fruit);
        }
    }
}
