package Structural.Bridge.Example01;

public class Produce implements Workshop{
    @Override
    public void work() {
        System.out.print("Produced");
    }
}
