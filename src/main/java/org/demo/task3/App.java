package org.demo.task3;

public class App
{
    public static void main(String[] args)
    {

        String str = "5c";

        try
        {
            Integer.parseInt(str);

            // str is a valid integer
            System.out.println("String converted to number " + str);
        }
        catch (NumberFormatException ex)
        {
            // str is not an integer
            System.out.println("String not converted");
        }


    }

}

