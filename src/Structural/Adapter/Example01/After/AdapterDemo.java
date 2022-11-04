package Structural.Adapter.Example01.After;

public class AdapterDemo {
    public static void main(String[] args) {
        Shape[] shapes = {new RectangleAdapter(new Structural.Adapter.Example01.After.Rectangle()), new LineAdapter(new Structural.Adapter.Example01.After.Line())};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1,y1,x2,y2);
        }
    }
}
