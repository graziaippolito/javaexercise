package org.demo.lesson2.class_structure_overview;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Log {

    public static String logLevel = "INFO";
    public String timestamp = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss").format(Calendar.getInstance().getTime());

    public static void writeLog(String message) {
        System.out.println(logLevel + ": " + message);

        //Uncomment and observe a compilation error
        // System.out.println(timestamp + " " + logLevel + ": " + message);
    }

    public void writeLogWithTimestamp(String message) {
        System.out.println(timestamp + " " + logLevel + ": " + message);
    }
}
