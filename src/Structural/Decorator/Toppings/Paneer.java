package Structural.Decorator.Toppings;

import Structural.Decorator.Pizza;

public class Paneer extends ToppingDecorator {
    Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 70 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Paneer ";
    }
}
