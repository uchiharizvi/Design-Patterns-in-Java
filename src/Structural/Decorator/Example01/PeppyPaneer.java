package Structural.Decorator.Example01;

//Concrete Class
public class PeppyPaneer extends Pizza {
    @Override
    public int getCost() {
        return 100;
    }

    public PeppyPaneer() {
        description = "PeppyPaneer";
    }
}
