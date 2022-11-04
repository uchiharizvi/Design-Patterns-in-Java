package Structural.Bridge.Example02;

public abstract class Shape {
    //Composition - Implementor
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
