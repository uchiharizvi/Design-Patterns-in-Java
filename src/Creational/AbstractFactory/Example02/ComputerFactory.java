package Creational.AbstractFactory.Example02;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory abstractFactory){
        return abstractFactory.createComputer();
    }
}
