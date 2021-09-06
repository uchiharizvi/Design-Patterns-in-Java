package Structural.Decorator.Toppings;

import Structural.Decorator.Pizza;

public class FreshTomato extends ToppingDecorator {
    //Ref to obj to decorate
    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 40 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato ";
    }
}
