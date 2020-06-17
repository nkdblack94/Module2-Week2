package Interface;

import inheritance.CircleAndCylinder.systemOfGeometricObjects.Shape;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(3, "blue", true);
        shapes[1] = new Circle(5, "black", true);
        shapes[2] = new Square(4, "yellow", true);
        System.out.println("original object");
        for (Shape shape : shapes){
            System.out.println(shape);
            if (shape instanceof Square){
                ((Square) shape).howToColor("red");
                System.out.println(shape.getColor());
            }
        }
    }
}
