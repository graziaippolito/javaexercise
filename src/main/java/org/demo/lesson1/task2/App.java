    package org.demo.lesson1.task2;

    public class App
    {
        public static void main( String[] args )
        {
            convertIntToString(5);

        }

        public static void convertIntToString (int someInt){
            String str = Integer.toString(someInt);
            System.out.println("String is " + str);
        }
    }