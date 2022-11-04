package Structural.Bridge.Example01;

public class BridgeDemo {
    public static void main(String[] args) {
        Vehicle audi = new Car(new Produce(), new Assemble());
        audi.manufacture();
        Vehicle hayabusa = new Bike(new Produce(), new Assemble());
        hayabusa.manufacture();
    }
}
