package Creational.FactoryMethod.Example02;

public class FactoryDemo {
    public static void main(String[] args) {
        Computer client = ComputerFactory.getComputer("Client","2 GB","1 TB","2.4 GHZ");
        Computer server = ComputerFactory.getComputer("Server","16 GB","50 TB","3.2 GHZ");
        System.out.println("Factory PC Config::"+client);
        System.out.println("Factory Server Config::"+server);
    }
}
