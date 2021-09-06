package Structural.Decorator.Toppings;

import Structural.Decorator.Pizza;

public class Barbeque extends ToppingDecorator {
    Pizza pizza;

    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 90 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Barbeque ";
    }
}
