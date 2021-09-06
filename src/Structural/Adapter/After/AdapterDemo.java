package Structural.Adapter.After;

import Structural.Adapter.Before.Line;
import Structural.Adapter.Before.Rectangle;

public class AdapterDemo {
    public static void main(String[] args) {
        Shape[] shapes = {new RectangleAdapter(new Structural.Adapter.After.Rectangle()), new LineAdapter(new Structural.Adapter.After.Line())};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1,y1,x2,y2);
        }
    }
}
