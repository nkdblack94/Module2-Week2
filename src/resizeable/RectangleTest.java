package resizeable;

import inheritance.CircleAndCylinder.systemOfGeometricObjects.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(3, 5);
        rectangles[1] = new Rectangle(6, 9);
        rectangles[2] = new Rectangle(5, 4);

        System.out.println("original shaped array");
        for (Rectangle rectangle: rectangles){
            System.out.println(rectangle);
        }

        System.out.println("after resize");
        for (Rectangle rectangle: rectangles){
            rectangle.resize(Math.floor(Math.random() * 100 + 1));
            System.out.println(rectangle);
        }
    }
}
