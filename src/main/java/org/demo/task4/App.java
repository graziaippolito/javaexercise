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

            boolean checkResult;

            //OR
            if (a || b)  {
                checkResult = true;
                System.out.println("argument #1 OR argument #2 " + checkResult);
            } else  {
                checkResult = false;
                System.out.println("argument #1 OR argument #2 " + checkResult);
            }

            //AND
            if (a && b)  {
                checkResult = true;
                System.out.println("argument #1 AND argument #2 " + checkResult);
            } else {
                checkResult = false;
                System.out.println("argument #1 AND argument #2 " + checkResult);
            }

            //XOR
            if (a ^ b)  {
                checkResult = true;
                System.out.println("argument #1 XOR argument #2 " + checkResult);
            } else {
                checkResult = false;
                System.out.println("argument #1 XOR argument #2 " + checkResult);
            }
            System.out.println("////////////////////////");
        }


    }
