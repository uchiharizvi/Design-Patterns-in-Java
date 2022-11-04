package Structural.Decorator.Example01.Toppings;

import Structural.Decorator.Example01.Pizza;

//Decorator Class
public abstract class ToppingDecorator extends Pizza {
    public abstract String getDescription();
}
