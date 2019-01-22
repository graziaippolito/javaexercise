package org.demo.lesson4.tasks;

import java.util.*;


public class task3 {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();

        //loop through the array
        for (int i = 0; i < 50; i++) {
            //insert random values into array
            int number = random.nextInt(25);
            //System.out.println(number);

            //assign index to value in array
            numbers.add(number);
        }

        //print array of random numbers without duplicates
        System.out.println(numbers);
    } }