    package org.demo.lesson1.task3;

    public class App
    {
        public static void main(String[] args)
        {

            convertStringToInt ("5ff") ;

        }

        public static void convertStringToInt (String someStr){
            try
            {
                Integer.parseInt(someStr);
                // someStr is a valid integer
                System.out.println("String converted to number " + someStr);
            }
            catch (NumberFormatException ex)
            {
                // someStr is not an integer
                System.out.println("String not converted");
            }

        }

    }

