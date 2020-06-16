package inheritance.CircleAndCylinder.PointAndMoveablePoint;

public class TestPointAndMovablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(1, 2);
        System.out.println(point);

        point = new Point(3, 5);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(10, 12);
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(2, 4, 6, 8);
        System.out.println(movablePoint);
        movablePoint.setSpeed(1, 2);
        movablePoint.setXY(2,1);
        System.out.println(movablePoint);
    }
}
