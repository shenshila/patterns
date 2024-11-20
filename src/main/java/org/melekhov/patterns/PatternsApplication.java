package org.melekhov.patterns;

import org.melekhov.patterns.singleton.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication {

    public static void main(String[] args) {

//        Singleton

        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();

        System.out.println(logger.equals(logger1));
        System.out.println(logger.classLog(logger1, "Hello World!"));


    }

}
