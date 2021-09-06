package Structural.Decorator;

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
