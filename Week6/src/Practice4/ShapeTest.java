package Practice4;

import java.util.Vector;

public class ShapeTest {
	public static void main(String[] args) {
        Circle circle1 = new Circle(200, Color.BLACK, 5);
        Circle circle2 = new Circle(150, Color.RED, 1);
        Rectangle rectangle1 = new Rectangle(200, Color.BLACK, 1, 2);
        Rectangle rectangle2 = new Rectangle(150, Color.RED, 6, 2);
        Triangle triangle1 = new Triangle(200, Color.BLACK, 1, 2);
        Triangle triangle2 = new Triangle(150, Color.RED, 6, 2);

        Vector<Shape> shapes = new Vector<Shape>();
        shapes.add(circle1);
        shapes.add(rectangle1);
        shapes.add(triangle1);
        shapes.add(circle2);
        shapes.add(rectangle2);
        shapes.add(triangle2);

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
