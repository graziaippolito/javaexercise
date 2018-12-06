package org.demo.lesson2.class_structure_overview;

public class App {

    public static void main(String[] args) {
        Log.writeLog("Web application started");

        Log.logLevel = "ERROR";

        Log.writeLog("Your web application was successfully crashed");


        Log logInstance = new Log();

        logInstance.logLevel = "WARNING";

        logInstance.writeLog("Oops, something went wrong");

        logInstance.writeLogWithTimestamp("Unknown login to system");
    }
}
