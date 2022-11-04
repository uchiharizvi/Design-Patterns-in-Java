package Creational.Builder.Example02;

public class Demo {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500 GB", "2GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
    }
}
