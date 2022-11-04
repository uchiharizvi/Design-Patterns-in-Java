package Structural.Decorator.Example02;

public class Sportscar extends CarDecorator {
    public Sportscar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
