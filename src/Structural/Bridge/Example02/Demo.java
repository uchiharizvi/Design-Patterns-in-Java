package Structural.Bridge.Example02;

public class Demo {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new Red());
        triangle.applyColor();

        Shape pentagon = new Pentagon(new Green());
        pentagon.applyColor();
    }
}
