package resizeable;

import inheritance.CircleAndCylinder.systemOfGeometricObjects.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(5);
        squares[1] = new Square(15);
        squares[2] = new Square(9);

        System.out.println("original shaped array");
        for (Square square : squares){
            System.out.println(square);
        }

        System.out.println("after resize");
        for (Square square1 : squares){
            square1.resize(Math.floor(Math.random() * 100 + 1));
            System.out.println(square1);
        }
    }
}
