package org.melekhov.patterns.singleton;

//- Singelton
//
//Создать класс логирования.
// Метод в нем должен выводить имя переданного класса и дополнительную информацию.
// classLogg(Object obj, String info)
//
//Пример вывода в методе: Log info: 21.07.23 - TestClass - Some info

import java.time.LocalDate;

public class Logger {

    private static Logger LOGGER;

    private Logger() {}

    public String classLog(Object obj, String info) {
        return "Log info: " + LocalDate.now() + " - " + obj.getClass().getName() + " - " + info;
    }

    public static Logger getInstance() {
        if (LOGGER == null) {
            LOGGER = new Logger();
        }
        return LOGGER;
    }

}
