package Structural.Adapter.Example02;

public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
