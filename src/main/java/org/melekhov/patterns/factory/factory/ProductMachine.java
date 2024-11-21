package org.melekhov.patterns.factory.factory;

import org.melekhov.patterns.factory.Product;
import org.melekhov.patterns.factory.coffee.Americano;
import org.melekhov.patterns.factory.coffee.Espresso;
import org.melekhov.patterns.factory.coffee.ICoffee;

public abstract class ProductMachine {
    public static ICoffee createProduct(Product product) {
        return switch (product) {
            case AMERICANO -> new Americano();
            case ESPRESSO -> new Espresso();
            default -> throw new IllegalArgumentException("Нет такого продукта!!!");
        };
    }
}
