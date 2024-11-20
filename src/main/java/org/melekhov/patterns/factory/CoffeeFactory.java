package org.melekhov.patterns.factory;

import static org.melekhov.patterns.factory.CoffeeType.AMERICANO;
import static org.melekhov.patterns.factory.CoffeeType.ESPRESSO;

public class CoffeeFactory {
    public static Coffee createCoffee(CoffeeType coffeeType) {
        return switch (coffeeType) {
            case AMERICANO -> new Americano();
            case ESPRESSO -> new Espresso();
            default -> throw new IllegalArgumentException("Нема такого кофе!!!");
        };
    }
}
