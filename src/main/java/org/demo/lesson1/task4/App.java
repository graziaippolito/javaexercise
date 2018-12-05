    package org.demo.task4;

    public class App
    {

        public static void main(String[] args)
        {
            displayResultsOfLogicalOperations(true, true);
            displayResultsOfLogicalOperations(false, true);
            displayResultsOfLogicalOperations(true, false);
            displayResultsOfLogicalOperations(false, false);

        }

        public static void displayResultsOfLogicalOperations(boolean a, boolean b){


            System.out.println("argument #1 OR argument #2 " + (a || b));
            System.out.println("argument #1 AND argument #2 " + (a && b));
            System.out.println("argument #1 XOR argument #2 " + (a ^ b));
            System.out.println("-------------------");
        }

    }
