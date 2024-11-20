package org.melekhov.patterns;

import org.melekhov.patterns.factory.CoffeeMachine;
import org.melekhov.patterns.singleton.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.melekhov.patterns.factory.CoffeeType.AMERICANO;

@SpringBootApplication
public class PatternsApplication {

    public static void main(String[] args) {

//        Singleton
//        Создать класс логирования. Метод в нем должен выводить имя переданного класса и дополнительную информацию.
//        classLogg(Object obj, String info)
//
//        Пример вывода в методе: Log info: 21.07.23 - TestClass - Some info

        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();

        System.out.println(logger.equals(logger1));
        System.out.println(logger.classLog(logger1, "Hello World!"));

//        Factory
//        Создать класс кофе, от него наследовать два вида кофе,
//        в зависимости от того какой тип кофе мы хотим, создавать именно его через фабрику. (espresso, americano)

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.getCoffee(AMERICANO);

    }

}
