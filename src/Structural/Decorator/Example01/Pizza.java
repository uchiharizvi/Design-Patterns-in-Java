package Structural.Decorator.Example01;

public abstract class Pizza {
    String description = "Unknown Pizza";

    public String getDescription() {
        return description;
    }

    public abstract int getCost();
}
