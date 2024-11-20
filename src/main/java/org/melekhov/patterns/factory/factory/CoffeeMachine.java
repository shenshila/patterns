package org.melekhov.patterns.factory.factory;

import org.melekhov.patterns.factory.Product;
import org.melekhov.patterns.factory.coffee.ICoffee;

public class CoffeeMachine extends ProductMachine {
    private ProductMachine coffeeFactory;

    public void getCoffee(Product coffeeType) {
        pourCoffee(createProduct(coffeeType));
    }

    private void pourCoffee(ICoffee coffee) {
        System.out.println("Кофе " + coffee.getName() + " наливается!");
    }

    @Override
    public void getCoffee(ICoffee coffee) {
        System.out.println("Кофе " + coffee.getName() + " наливается!");
    }
}
