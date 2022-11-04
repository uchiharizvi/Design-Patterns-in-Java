package Structural.Composite.Example02;

/**
 * Leaf Object
 **/
public class Circle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color " + fillColor);
    }
}
