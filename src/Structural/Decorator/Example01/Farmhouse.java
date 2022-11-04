package Structural.Decorator.Example01;

public class Farmhouse extends Pizza{
    @Override
    public int getCost() {
        return 200;
    }

    public Farmhouse() {
        description = "FarmHouse";
    }
}
