package org.melekhov.patterns.factory;

public class CoffeeMachine {
    private CoffeeFactory coffeeFactory;

    public void getCoffee(CoffeeType coffeeType) {
        pourCoffee(coffeeFactory.createCoffee(coffeeType));
    }

    private void pourCoffee(Coffee coffee) {
        System.out.println("Кофе " + coffee.getName() + " наливается!");
    }
}
