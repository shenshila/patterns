package org.melekhov.patterns.singleton;

import java.time.LocalDate;

public class Logger {

    private static Logger LOGGER;
//    private static volatile Logger LOGGER; // if multithreading

    private Logger() {}

    public String classLog(Object obj, String info) {
        return "Log info: " + LocalDate.now() + " - " + obj.getClass().getName() + " - " + info;
    }

    public static Logger getInstance() {
        if (LOGGER == null) {
//            synchronized (Logger.class) { // if multithreading
//                if (LOGGER == null) {
                    LOGGER = new Logger();
//                }
//            }
        }

        return LOGGER;
    }

}
