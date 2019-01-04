package org.demo.lesson4.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task2 {

    public static void main(String[] args) {

        Random random = new Random();
        //create array of 50 elements
        int numbers[]= new int[50];

        // create empty array even
        List<String> arrayEven = new ArrayList<>();

        // create empty array odd
        List<String> arrayOdd = new ArrayList<>();


        //loop through the array
        for (int i = 0; i < 50; i++)
        {
            //insert random values into array
            int number = random.nextInt(100);
            System.out.println(number);
            numbers[i]=number;

            if((number % 2)==0) {
            // even
                // add to arrayEven
                arrayEven.add(String.valueOf(number));
            }
            else{
            // odd
                // add to arrayOdd
                arrayOdd.add(String.valueOf(number));
            }
        }


        // print array of even
        System.out.println("array of even numbers: " + arrayEven);

        // print array of odd
        System.out.println("array of odd numbers: " + arrayOdd);

    }
}
