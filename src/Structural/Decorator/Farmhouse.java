package Structural.Decorator;

public class Farmhouse extends Pizza{
    @Override
    public int getCost() {
        return 200;
    }

    public Farmhouse() {
        description = "FarmHouse";
    }
}
