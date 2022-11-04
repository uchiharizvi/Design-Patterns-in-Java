package Structural.Decorator.Example02;

public class Demo {
    public static void main(String[] args) {
        Car sportsCar = new Sportscar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new Sportscar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
