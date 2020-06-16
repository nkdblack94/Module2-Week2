package resizeable;

import inheritance.CircleAndCylinder.systemOfGeometricObjects.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(15);
        circle[1] = new Circle(5);
        circle[2] = new Circle(8);

        System.out.println("original shaped array");
        for (Circle circle1 : circle){
            System.out.println(circle1);
        }

        System.out.println("after resize");
        for (Circle circle1 : circle){
            circle1.resize(Math.floor(Math.random() * 100 + 1));
            System.out.println(circle1);
        }

    }
}
