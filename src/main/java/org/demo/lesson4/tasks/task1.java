package org.demo.lesson4.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task1 {

    public static void main(String[] args) {
        List<String> myArray = new ArrayList<>();

        myArray.add("foo");
        myArray.add("1");
        myArray.add("bar");
        myArray.add("9.99");
        myArray.add("apple");
        myArray.add("834");
        System.out.println("MY Array (list):" + myArray.toString());

        //new array with integers
        List<String> arrayIntegers = new ArrayList<>();

        //iteration on array elements
        Iterator itr = myArray.iterator();
        while (itr.hasNext()) {
            String someElement = String.valueOf(itr.next());

                // check if someElement is an integer
                try {
                    Integer.parseInt(someElement);

                    // add to arrayIntegers
                    arrayIntegers.add(someElement);

                } catch (NumberFormatException e) {

                }

        }

        //print array of integers
        System.out.println("arrayIntegers: " + arrayIntegers);

    }
}