package org.demo.lesson4;

public class AppArrays {

    public static void main(String[] args) {

        String[] someStrings = new String[3];
        someStrings[0] = "aaaa";
        someStrings[1] = "bbb";

        for (String someString: someStrings) {
            System.out.println(someString);
        }
    }
}
